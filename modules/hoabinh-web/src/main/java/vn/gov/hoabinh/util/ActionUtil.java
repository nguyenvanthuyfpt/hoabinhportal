package vn.gov.hoabinh.util;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.model.VcmsPortion;
import vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil;

public class ActionUtil {
	
	public Log log = LogFactoryUtil.getLog(this.getClass());
	
	public static final String DEFAULT_CATEGORY_ID = "0";
	
	public static String getCategoryTree(long groupId, String language, String portionId, String parentId, String categoryId)	
			throws SystemException, PortalException {

		StringBuffer sb = new StringBuffer();
		List<VcmsPortion> portions = new ArrayList<VcmsPortion>();
		try {
			if (!"0".equals(portionId)) {
				VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(portionId);
				if (Validator.isNotNull(portion)) {
					portions.add(portion);
				}
				
			} else {
				portions = VcmsPortionLocalServiceUtil.getPortionsByG_L(groupId, language);
			}
		} catch (Exception ex) {
			ex.toString();
		}

		for (int i = 0; i < portions.size(); i++) {
			VcmsPortion portion = (VcmsPortion) portions.get(i);

			if (!portion.getCategorizable()) {
				continue;
			}
			
			sb.append("<option value=\"" + portion.getPortionId() + "|" + DEFAULT_CATEGORY_ID + "\" ");
			sb.append(">");
			sb.append(portion.getName());
			sb.append("</option>");

			List<VcmsCategory> categories = new ArrayList();

			try {
				categories = VcmsCategoryLocalServiceUtil.getCategoriesByP_P(portion.getGroupId(), portion.getLanguage(), DEFAULT_CATEGORY_ID, portion.getPortionId());
			} catch (Exception ex) {
				continue;
			}

			int indent = 4;
			traverseCategoryTree(sb, categories, indent, parentId, categoryId);
		}

		return sb.toString();
	}
	
	private static void traverseCategoryTree(StringBuffer sb, List categories, int indent, String parentId, String categoryId) {

		if ((categories == null) || (categories.size() <= 0)) {
			return;
		}

		for (int i = 0; i < categories.size(); i++) {
			VcmsCategory category = (VcmsCategory) categories.get(i);

			/*if (category.getCategoryId().equals(categoryId) || category.isAnchored()) {
				continue;
			}*/

			sb.append("<option value=\"" + category.getPortionId() + "|" + category.getCategoryId() + "\" ");
			String optValue = category.getPortionId() + "|" + category.getCategoryId();
			if (!"".equals(categoryId)) {
				sb.append((optValue.indexOf("|"+categoryId)>-1) ? "selected=\"selected\"" : "");
			}
			sb.append(">");

			// Indent
			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);
			}

			sb.append(category.getName());
			sb.append("</option>");

			try {
				traverseCategoryTree(sb, VcmsCategoryLocalServiceUtil.getCategoriesByParent(category.getGroupId(),
						category.getLanguage(), category.getCategoryId()), indent + 4, parentId, categoryId);
			} catch (Exception ex) {
				// Ignore..
			}
		}
	}
	
	public static String getCategoryTree(long groupId, String language, String portletNamespace, String portionId, String[] strPortion,
			String[] catSelectedIds) {

		StringBuffer sb = new StringBuffer();

		try {
			List<VcmsPortion> portions = new ArrayList<VcmsPortion>();
			if (Validator.isNotNull(strPortion) || "-1".equals(portionId)) {
				portions = VcmsPortionLocalServiceUtil.getPortionsByG_L(groupId, language);
			} else {
				VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(portionId);
				portions.add(portion);
			}

			if ((portions == null) || (portions.size() <= 0)) {
				return null;
			}

			for (int j = 0; j < portions.size(); j++) {
				VcmsPortion portion = (VcmsPortion) portions.get(j);

				sb.append("<tr>");
				sb.append("<td width=\"100%\" valign=\"middle\" ");
				sb.append(portion.getCategorizable() ? "style=\"font-color: #F1F1f1\">" : ">");
				sb.append(StringPool.NBSP);
				sb.append(StringPool.NBSP);
				sb.append("<input type=\"checkbox\" name=\"");
				sb.append(portletNamespace + "portion\" id=\"");
				sb.append(portletNamespace + "portion_" + portion.getPortionId() + "\" ");
				sb.append("value=\"" + portion.getPortionId() + "\" ");

				if (Validator.isNotNull(strPortion)) {
					for (int k = 0; k < strPortion.length; k++) {
						if (portion.getPortionId().equals(strPortion[k])) {
							sb.append("checked=\"true\"");
						}
					}
				}

				sb.append(portion.getCategorizable() ? "disabled />"

						: " />");
				sb.append("<label for=\"");
				sb.append(portletNamespace + "portion_" + portion.getPortionId() + "\" >");
				sb.append("<b>");
				sb.append(StringPool.NBSP);
				sb.append(portion.getName());
				sb.append("</b>");
				sb.append("</label>");
				sb.append("</td>");
				sb.append("</tr>");

				if (!portion.getCategorizable()) {
					continue;
				}

				List<VcmsCategory> categories = VcmsCategoryLocalServiceUtil.getCategoriesByP_P(portion.getGroupId(),
						portion.getLanguage(), DEFAULT_CATEGORY_ID, portion.getPortionId());

				if ((categories == null) || (categories.size() <= 0)) {
					continue;
				}

				int indent = 5;
				traverseCategoryTree2(sb, categories, indent + 5, portletNamespace, catSelectedIds);
			}
		} catch (Exception ex) {
		}
		return sb.toString();
	}
	
	private static void traverseCategoryTree2(StringBuffer sb, List categories, int indent, String portletNamespace,
			String[] catSelectedIds) throws SystemException, PortalException {

		if ((categories == null) || (categories.size() <= 0)) {
			return;
		}

		for (int i = 0; i < categories.size(); i++) {
			VcmsCategory category = (VcmsCategory) categories.get(i);

			sb.append("<tr>");
			sb.append("<td width=\"100%\" valign=\"middle\" ");
			sb.append(category.getAnchored() ? "style=\"font-color: #F1F1f1\" >" : ">");

			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);
			}
			sb.append(StringPool.NBSP);
			sb.append(StringPool.NBSP);
			sb.append("<input type=\"checkbox\" name=\"");
			sb.append(portletNamespace + "category\" id=\"");
			sb.append(portletNamespace + "category_" + category.getCategoryId() + "\" ");
			sb.append("value=\"" + category.getCategoryId() + "\" ");

			if (Validator.isNotNull(catSelectedIds)) {
				for (int k = 0; k < catSelectedIds.length; k++) {
					if (category.getCategoryId().equals(catSelectedIds[k])) {
						sb.append("checked=\"true\"");
					}
				}
			}

			sb.append(" />");
			sb.append("<label for=\"");
			sb.append(portletNamespace + "category_" + category.getCategoryId() + "\" >");
			sb.append(StringPool.NBSP);
			sb.append(category.getName());
			sb.append("</label>");
			sb.append("</td>");
			sb.append("</tr>");

			if (category.getAnchored()) {
				// continue;
			}

			try {
				traverseCategoryTree2(sb,
						VcmsCategoryLocalServiceUtil.getCategoriesByParent(category.getGroupId(),
								category.getLanguage(), category.getCategoryId()),
						(indent + 5), portletNamespace, catSelectedIds);
			} catch (Exception ex) {
				// Ignore ...
			}
		}
	}
	
	public static String getCategoryMenu(List<VcmsCategory> categories, String portletNamespace, String categorySelected) throws SystemException, PortalException {
		StringBuffer sb = new StringBuffer();
		traverseCategoryTreeCheckbox(sb, categories, 2, portletNamespace, categorySelected);
		return sb.toString();
	}
	
	private static void traverseCategoryTreeCheckbox(StringBuffer sb, List<VcmsCategory> categories, int indent, String portletNamespace, String categorySelected)
			throws SystemException, PortalException {

		if ((categories == null) || (categories.size() <= 0)) {
			return;
		}

		for (int i = 0; i < categories.size(); i++) {
			VcmsCategory category = (VcmsCategory) categories.get(i);

			sb.append("<tr>");
			sb.append("<td width=\"100%\" valign=\"middle\" ");
			sb.append(category.getAnchored() ? "style=\"font-color: #F1F1f1\" >" : ">");
			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);
			}
			sb.append("<input type=\"checkbox\" name=\"");
			sb.append(portletNamespace + "category\" id=\"");
			sb.append(portletNamespace + "category_" + category.getCategoryId() + "\" ");
			sb.append("value=\"" + category.getCategoryId() + "\" ");
			if (categorySelected.indexOf(category.getCategoryId())>-1) {
				sb.append("checked=\"true\"");
			}
			sb.append(" />");
			sb.append("<label for=\"");
			sb.append(portletNamespace + "category_" + category.getCategoryId() + "\" >");
			sb.append(category.getCategoryId() + "-" + category.getName());
			sb.append("</label>");
			sb.append("</td>");
			sb.append("<td>");

			try {
				traverseCategoryTreeCheckbox(sb, VcmsCategoryLocalServiceUtil.getCategoriesByP_P(14, PortalConstant.DEFAULT_LANGUAGE, 
						category.getCategoryId(), category.getPortionId()), (indent + 5), portletNamespace, categorySelected);
			} catch (Exception ex) {
				// Ignore ...
			}
		}
	}
	
	public static String getListParentCategory(String categoryId)
			throws PortalException, SystemException, RemoteException {
		StringBuffer sb = new StringBuffer();
		sb.append(categoryId);
		getParentCategory(sb, categoryId);
		return sb.toString();
	}

	public static void getParentCategory(StringBuffer sb, String categoryId)
			throws PortalException, SystemException, RemoteException {
		VcmsCategory vCategory = VcmsCategoryLocalServiceUtil.getCategory(categoryId);
		if (!vCategory.getParentId().equals("0")) {
			sb.append("," + vCategory.getParentId());
			getParentCategory(sb, vCategory.getParentId());
		}
	}
	
	public static String categorySelected(String catSel) throws Exception {
		String catSelected = "";
		if (Validator.isNotNull(catSel)) {
			String[] arrCatId = StringUtil.split(catSel, "#");
			if (Validator.isNotNull(arrCatId)) {
				int inc = 0;
				for (int i = 0; i < arrCatId.length; i++) {
					inc++;
					VcmsCategory category = VcmsCategoryLocalServiceUtil.getCategory(arrCatId[i]);
					catSelected += (inc < arrCatId.length - 1) ? category.getName() + ", " : category.getName();
				}
			}
		}
		return catSelected;
	}
}
