/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gov.hoabinh.service.impl;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.model.VcmsArticleRating;
import vn.gov.hoabinh.service.base.VcmsArticleRatingLocalServiceBaseImpl;

/**
 * The implementation of the vcms article rating local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsArticleRatingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleRatingLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsArticleRatingLocalServiceUtil
 */
@ProviderType
public class VcmsArticleRatingLocalServiceImpl extends VcmsArticleRatingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsArticleRatingLocalServiceUtil} to access the
	 * vcms article rating local service.
	 */

	public VcmsArticleRating addRating(long articleId, int rating, String session) throws Exception {
		long Id = CounterLocalServiceUtil.increment(VcmsArticleRating.class.getName());
		VcmsArticleRating articleRating = vcmsArticleRatingPersistence.create(Id);
		articleRating.setArticleId(articleId);
		articleRating.setRating(rating);
		articleRating.setCreatedDate(new Date());
		vcmsArticleRatingPersistence.update(articleRating);
		return articleRating;
	}

	public int countRatingByA_R(long articleId) throws Exception {
		return (int) vcmsArticleRatingPersistence.countByA_R(articleId);
	}

	public List<VcmsArticleRating> getRatingByA_R(long articleId) throws Exception {
		return vcmsArticleRatingPersistence.findByA_R(articleId);
	}
	
	public void deleteRatingByA_S(long articleId, String session) throws Exception {
		vcmsArticleRatingPersistence.removeByA_S(articleId, session);
	}

	public double getAvgRating(long articleId) throws Exception {
		double avgRating = 0.0;
		double retval = 0;
		int sumRating = 0, numRating = 0;
		List<VcmsArticleRating> listRating = getRatingByA_R(articleId);
		if (Validator.isNotNull(listRating) && listRating.size()>0) {
			numRating = listRating.size();
			for (VcmsArticleRating vcmsArticleRating : listRating) {
				sumRating += vcmsArticleRating.getRating();
			}
			avgRating = (double) sumRating / numRating;
			DecimalFormat df = new DecimalFormat("#.##");      
			retval = Double.valueOf(df.format(avgRating));
		} else {
			retval = 0;
		}
		return retval;
	}
}