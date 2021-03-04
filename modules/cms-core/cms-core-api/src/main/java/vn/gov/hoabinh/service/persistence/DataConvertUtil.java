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

package vn.gov.hoabinh.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.DataConvert;

import java.util.List;

/**
 * The persistence utility for the data convert service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.DataConvertPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DataConvertPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.DataConvertPersistenceImpl
 * @generated
 */
@ProviderType
public class DataConvertUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DataConvert dataConvert) {
		getPersistence().clearCache(dataConvert);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DataConvert> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DataConvert> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DataConvert> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DataConvert> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DataConvert update(DataConvert dataConvert) {
		return getPersistence().update(dataConvert);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DataConvert update(DataConvert dataConvert,
		ServiceContext serviceContext) {
		return getPersistence().update(dataConvert, serviceContext);
	}

	/**
	* Caches the data convert in the entity cache if it is enabled.
	*
	* @param dataConvert the data convert
	*/
	public static void cacheResult(DataConvert dataConvert) {
		getPersistence().cacheResult(dataConvert);
	}

	/**
	* Caches the data converts in the entity cache if it is enabled.
	*
	* @param dataConverts the data converts
	*/
	public static void cacheResult(List<DataConvert> dataConverts) {
		getPersistence().cacheResult(dataConverts);
	}

	/**
	* Creates a new data convert with the primary key. Does not add the data convert to the database.
	*
	* @param id the primary key for the new data convert
	* @return the new data convert
	*/
	public static DataConvert create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the data convert with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the data convert
	* @return the data convert that was removed
	* @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	*/
	public static DataConvert remove(long id)
		throws vn.gov.hoabinh.exception.NoSuchDataConvertException {
		return getPersistence().remove(id);
	}

	public static DataConvert updateImpl(DataConvert dataConvert) {
		return getPersistence().updateImpl(dataConvert);
	}

	/**
	* Returns the data convert with the primary key or throws a {@link NoSuchDataConvertException} if it could not be found.
	*
	* @param id the primary key of the data convert
	* @return the data convert
	* @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	*/
	public static DataConvert findByPrimaryKey(long id)
		throws vn.gov.hoabinh.exception.NoSuchDataConvertException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the data convert with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the data convert
	* @return the data convert, or <code>null</code> if a data convert with the primary key could not be found
	*/
	public static DataConvert fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, DataConvert> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the data converts.
	*
	* @return the data converts
	*/
	public static List<DataConvert> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the data converts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataConvertModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data converts
	* @param end the upper bound of the range of data converts (not inclusive)
	* @return the range of data converts
	*/
	public static List<DataConvert> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the data converts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataConvertModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data converts
	* @param end the upper bound of the range of data converts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of data converts
	*/
	public static List<DataConvert> findAll(int start, int end,
		OrderByComparator<DataConvert> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the data converts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataConvertModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data converts
	* @param end the upper bound of the range of data converts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of data converts
	*/
	public static List<DataConvert> findAll(int start, int end,
		OrderByComparator<DataConvert> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the data converts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of data converts.
	*
	* @return the number of data converts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DataConvertPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataConvertPersistence, DataConvertPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DataConvertPersistence.class);
}