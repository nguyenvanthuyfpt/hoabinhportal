package vn.gov.hoabinh.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.TreeNode;

public class PortletUtil {

	private static Log log = LogFactoryUtil.getLog(PortletUtil.class);

	public static long getDefaultPlid(long groupId, String portletId) throws PortalException, SystemException {
		long plid = LayoutLocalServiceUtil.getDefaultPlid(groupId, true, portletId);
		if (plid > 0) {
			return plid;
		}

		return LayoutLocalServiceUtil.getDefaultPlid(groupId, false, portletId);
	}

	private static void addLeaves(TreeNode<Layout> tree, long groupId, boolean privateLayout, long parentLayoutId)
			throws SystemException {
		List<Layout> layouts = LayoutLocalServiceUtil.getLayouts(groupId, privateLayout, parentLayoutId);
		for (Layout layout : layouts) {
			TreeNode<Layout> child = tree.addChildNode(layout);
			addLeaves(child, groupId, privateLayout, layout.getLayoutId());
		}
	}

	private static TreeNode<Layout> getLayoutTree(long groupId, boolean privateLayout) throws SystemException {
		TreeNode<Layout> root = new TreeNode<Layout>(null);
		addLeaves(root, groupId, privateLayout, 0);
		return root;
	}

	private static String leftFill(String st, String pad, int times) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < times; i++) {
			builder.append(pad);
		}
		builder.append(st);
		return builder.toString();
	}

	private static void convertLayoutTreeToListOption(TreeNode<Layout> tree, int level, Locale locale,
			List<KeyValuePair> options) {
		Layout layout = tree.getValue();
		if (layout != null) {
			String layoutName = layout.getName(locale);
			options.add(new KeyValuePair(String.valueOf(layout.getPlid()), leftFill(layoutName, "-", 2 * level)));
		}

		List<TreeNode<Layout>> nodes = tree.getChildNodes();
		for (TreeNode<Layout> node : nodes) {
			convertLayoutTreeToListOption(node, level + 1, locale, options);
		}
	}

	public static List<KeyValuePair> getLayoutListOption(long groupId, boolean privateLayout, Locale locale)
			throws SystemException {
		List<KeyValuePair> options = new ArrayList<KeyValuePair>();
		TreeNode<Layout> tree = getLayoutTree(groupId, privateLayout);
		convertLayoutTreeToListOption(tree, -1, locale, options);
		return options;
	}

	public static Object[] getDefaultPlidAndType(long groupId, String portletId)
			throws PortalException, SystemException {
		long plid = LayoutLocalServiceUtil.getDefaultPlid(groupId, true, portletId);
		if (plid > 0) {
			return new Object[] { plid, true };
		}

		return new Object[] { LayoutLocalServiceUtil.getDefaultPlid(groupId, false, portletId), false };
	}
}
