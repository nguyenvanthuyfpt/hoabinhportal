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

package vn.gov.hoabinh.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchDataConvertException;
import vn.gov.hoabinh.model.DataConvert;
import vn.gov.hoabinh.model.impl.DataConvertImpl;
import vn.gov.hoabinh.model.impl.DataConvertModelImpl;
import vn.gov.hoabinh.service.persistence.DataConvertPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the data convert service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DataConvertPersistence
 * @see vn.gov.hoabinh.service.persistence.DataConvertUtil
 * @generated
 */
@ProviderType
public class DataConvertPersistenceImpl extends BasePersistenceImpl<DataConvert>
	implements DataConvertPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DataConvertUtil} to access the data convert persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DataConvertImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
			DataConvertModelImpl.FINDER_CACHE_ENABLED, DataConvertImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
			DataConvertModelImpl.FINDER_CACHE_ENABLED, DataConvertImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
			DataConvertModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DataConvertPersistenceImpl() {
		setModelClass(DataConvert.class);
	}

	/**
	 * Caches the data convert in the entity cache if it is enabled.
	 *
	 * @param dataConvert the data convert
	 */
	@Override
	public void cacheResult(DataConvert dataConvert) {
		entityCache.putResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
			DataConvertImpl.class, dataConvert.getPrimaryKey(), dataConvert);

		dataConvert.resetOriginalValues();
	}

	/**
	 * Caches the data converts in the entity cache if it is enabled.
	 *
	 * @param dataConverts the data converts
	 */
	@Override
	public void cacheResult(List<DataConvert> dataConverts) {
		for (DataConvert dataConvert : dataConverts) {
			if (entityCache.getResult(
						DataConvertModelImpl.ENTITY_CACHE_ENABLED,
						DataConvertImpl.class, dataConvert.getPrimaryKey()) == null) {
				cacheResult(dataConvert);
			}
			else {
				dataConvert.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all data converts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DataConvertImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the data convert.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DataConvert dataConvert) {
		entityCache.removeResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
			DataConvertImpl.class, dataConvert.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DataConvert> dataConverts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DataConvert dataConvert : dataConverts) {
			entityCache.removeResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
				DataConvertImpl.class, dataConvert.getPrimaryKey());
		}
	}

	/**
	 * Creates a new data convert with the primary key. Does not add the data convert to the database.
	 *
	 * @param id the primary key for the new data convert
	 * @return the new data convert
	 */
	@Override
	public DataConvert create(long id) {
		DataConvert dataConvert = new DataConvertImpl();

		dataConvert.setNew(true);
		dataConvert.setPrimaryKey(id);

		return dataConvert;
	}

	/**
	 * Removes the data convert with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the data convert
	 * @return the data convert that was removed
	 * @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	 */
	@Override
	public DataConvert remove(long id) throws NoSuchDataConvertException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the data convert with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the data convert
	 * @return the data convert that was removed
	 * @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	 */
	@Override
	public DataConvert remove(Serializable primaryKey)
		throws NoSuchDataConvertException {
		Session session = null;

		try {
			session = openSession();

			DataConvert dataConvert = (DataConvert)session.get(DataConvertImpl.class,
					primaryKey);

			if (dataConvert == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDataConvertException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dataConvert);
		}
		catch (NoSuchDataConvertException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DataConvert removeImpl(DataConvert dataConvert) {
		dataConvert = toUnwrappedModel(dataConvert);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dataConvert)) {
				dataConvert = (DataConvert)session.get(DataConvertImpl.class,
						dataConvert.getPrimaryKeyObj());
			}

			if (dataConvert != null) {
				session.delete(dataConvert);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dataConvert != null) {
			clearCache(dataConvert);
		}

		return dataConvert;
	}

	@Override
	public DataConvert updateImpl(DataConvert dataConvert) {
		dataConvert = toUnwrappedModel(dataConvert);

		boolean isNew = dataConvert.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dataConvert.isNew()) {
				session.save(dataConvert);

				dataConvert.setNew(false);
			}
			else {
				dataConvert = (DataConvert)session.merge(dataConvert);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
			DataConvertImpl.class, dataConvert.getPrimaryKey(), dataConvert,
			false);

		dataConvert.resetOriginalValues();

		return dataConvert;
	}

	protected DataConvert toUnwrappedModel(DataConvert dataConvert) {
		if (dataConvert instanceof DataConvertImpl) {
			return dataConvert;
		}

		DataConvertImpl dataConvertImpl = new DataConvertImpl();

		dataConvertImpl.setNew(dataConvert.isNew());
		dataConvertImpl.setPrimaryKey(dataConvert.getPrimaryKey());

		dataConvertImpl.setId(dataConvert.getId());
		dataConvertImpl.setFolderId(dataConvert.getFolderId());
		dataConvertImpl.setDataId(dataConvert.getDataId());
		dataConvertImpl.setGroupId(dataConvert.getGroupId());
		dataConvertImpl.setFileEntryId(dataConvert.getFileEntryId());
		dataConvertImpl.setCreatedDate(dataConvert.getCreatedDate());
		dataConvertImpl.setFileName(dataConvert.getFileName());
		dataConvertImpl.setUrl(dataConvert.getUrl());

		return dataConvertImpl;
	}

	/**
	 * Returns the data convert with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the data convert
	 * @return the data convert
	 * @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	 */
	@Override
	public DataConvert findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDataConvertException {
		DataConvert dataConvert = fetchByPrimaryKey(primaryKey);

		if (dataConvert == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDataConvertException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dataConvert;
	}

	/**
	 * Returns the data convert with the primary key or throws a {@link NoSuchDataConvertException} if it could not be found.
	 *
	 * @param id the primary key of the data convert
	 * @return the data convert
	 * @throws NoSuchDataConvertException if a data convert with the primary key could not be found
	 */
	@Override
	public DataConvert findByPrimaryKey(long id)
		throws NoSuchDataConvertException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the data convert with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the data convert
	 * @return the data convert, or <code>null</code> if a data convert with the primary key could not be found
	 */
	@Override
	public DataConvert fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
				DataConvertImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DataConvert dataConvert = (DataConvert)serializable;

		if (dataConvert == null) {
			Session session = null;

			try {
				session = openSession();

				dataConvert = (DataConvert)session.get(DataConvertImpl.class,
						primaryKey);

				if (dataConvert != null) {
					cacheResult(dataConvert);
				}
				else {
					entityCache.putResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
						DataConvertImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
					DataConvertImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dataConvert;
	}

	/**
	 * Returns the data convert with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the data convert
	 * @return the data convert, or <code>null</code> if a data convert with the primary key could not be found
	 */
	@Override
	public DataConvert fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, DataConvert> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DataConvert> map = new HashMap<Serializable, DataConvert>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DataConvert dataConvert = fetchByPrimaryKey(primaryKey);

			if (dataConvert != null) {
				map.put(primaryKey, dataConvert);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
					DataConvertImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DataConvert)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DATACONVERT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (DataConvert dataConvert : (List<DataConvert>)q.list()) {
				map.put(dataConvert.getPrimaryKeyObj(), dataConvert);

				cacheResult(dataConvert);

				uncachedPrimaryKeys.remove(dataConvert.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DataConvertModelImpl.ENTITY_CACHE_ENABLED,
					DataConvertImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the data converts.
	 *
	 * @return the data converts
	 */
	@Override
	public List<DataConvert> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DataConvert> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<DataConvert> findAll(int start, int end,
		OrderByComparator<DataConvert> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<DataConvert> findAll(int start, int end,
		OrderByComparator<DataConvert> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<DataConvert> list = null;

		if (retrieveFromCache) {
			list = (List<DataConvert>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DATACONVERT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATACONVERT;

				if (pagination) {
					sql = sql.concat(DataConvertModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DataConvert>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataConvert>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the data converts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DataConvert dataConvert : findAll()) {
			remove(dataConvert);
		}
	}

	/**
	 * Returns the number of data converts.
	 *
	 * @return the number of data converts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DATACONVERT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DataConvertModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the data convert persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DataConvertImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DATACONVERT = "SELECT dataConvert FROM DataConvert dataConvert";
	private static final String _SQL_SELECT_DATACONVERT_WHERE_PKS_IN = "SELECT dataConvert FROM DataConvert dataConvert WHERE id_ IN (";
	private static final String _SQL_COUNT_DATACONVERT = "SELECT COUNT(dataConvert) FROM DataConvert dataConvert";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dataConvert.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DataConvert exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(DataConvertPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}