package vn.gov.hoabinh.portlet.cms;

import com.liferay.portal.kernel.util.StringUtil;

import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.model.VcmsPortion;
import vn.gov.hoabinh.service.VcmsArticleLocalService;
import vn.gov.hoabinh.service.VcmsAttachedMessageLocalService;
import vn.gov.hoabinh.service.VcmsCategoryLocalService;
import vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil;

public class CmsUtils {
	static VcmsArticleLocalService articleService;
	static VcmsCategoryLocalService categoryService;
	static VcmsAttachedMessageLocalService attachedMessageService;
	
	public static String getCurPortion(String articleId) throws Exception {
		String curPortion = "";
		String curCategoryId = "";
		VcmsArticle article = articleService.getArticle(articleId);
		curCategoryId = article.getCategoryId();
		if (!"".equals(curCategoryId)) {
			String[] arrCatId = StringUtil.split(curCategoryId, "#");
			String curPortionId = "0";
			int inc = 0;
			for (int i = 0; i < arrCatId.length; i++) {
				String catId = arrCatId[i];
				if (!"".equals(catId)) {
					VcmsCategory category = VcmsCategoryLocalServiceUtil.getCategory(catId);
					VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(category.getPortionId());
					if (inc == 0) {
						curPortion = portion.getName();
					} else {
						curPortion += (!curPortionId.equals(portion.getPortionId())) ? ", " + portion.getName() : "";
					}
					inc++;
					curPortionId = portion.getPortionId();
				}
			}
		}
		return curPortion;
	}
	
	public VcmsArticleLocalService getArticleService() {
		return articleService;
	}

	public void setArticleService(VcmsArticleLocalService articleService) {
		this.articleService = articleService;
	}

	public VcmsCategoryLocalService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(VcmsCategoryLocalService categoryService) {
		this.categoryService = categoryService;
	}

	public VcmsAttachedMessageLocalService getAttachedMessageService() {
		return attachedMessageService;
	}

	public void setAttachedMessageService(VcmsAttachedMessageLocalService attachedMessageService) {
		this.attachedMessageService = attachedMessageService;
	}

}
