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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gov.hoabinh.exception.NoSuchDataConvertException;
import vn.gov.hoabinh.model.DataConvert;

/**
 * The persistence interface for the data convert service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.DataConvertPersistenceImpl
 * @see DataConvertUtil
 * @generated
 */
@ProviderType
public interface DataConvertPersistence extends BasePersistence<DataConvert> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DataConvertUtil} to access the data convert persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the data convert in the entity cache if it is enabled.
	*
	* @param dataConvert the data convert
	*/
	public void cacheResult(DataConvert dataConvert);

	/**
	* Caches the data converts in the entity cache if it is enabled.
	*
	* @param dataConverts the data converts
	*/
	public void cacheResult(java.util.List<DataConvert> dataConverts);

	/**
	* Creates a new data convert with the primary key. Does not add the data convert to the database.
	*
	* @param id the primary key for the new data convert
	* @return the new data convert
	*/
	public DataConvert create(long id);

	/**
	* Removes the data convert with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the data convert
	* @return the data convert that was removed
	* @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	*/
	public DataConvert remove(long id) throws NoSuchDataConvertException;

	public DataConvert updateImpl(DataConvert dataConvert);

	/**
	* Returns the data convert with the primary key or throws a {@link NoSuchDataConvertException} if it could not be found.
	*
	* @param id the primary key of the data convert
	* @return the data convert
	* @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	*/
	public DataConvert findByPrimaryKey(long id)
		throws NoSuchDataConvertException;

	/**
	* Returns the data convert with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the data convert
	* @return the data convert, or <code>null</code> if a data convert with the primary key could not be found
	*/
	public DataConvert fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, DataConvert> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the data converts.
	*
	* @return the data converts
	*/
	public java.util.List<DataConvert> findAll();

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
	public java.util.List<DataConvert> findAll(int start, int end);

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
	public java.util.List<DataConvert> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataConvert> orderByComparator);

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
	public java.util.List<DataConvert> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataConvert> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the data converts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of data converts.
	*
	* @return the number of data converts
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}