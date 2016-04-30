package com.winterhaven_mc.lodestar;

import java.util.List;


public abstract class DataStore {

	protected boolean initialized;
	
	protected DataStoreType type;

	protected String filename;

	/**
	 * Initialize storage
	 * @throws Exception
	 */
	abstract void initialize() throws Exception;
	
	/**
	 * Get record
	 * @param warpName
	 * @return warp object or null if no matching record
	 */
	abstract Destination getRecord(String warpName);
	
	/**
	 * Store record
	 * @param destination
	 */
	abstract void putRecord(Destination destination);

	/**
	 * get all display names
	 * @return
	 */
	abstract List<String> getAllKeys();
	
	/**
	 * get all records
	 * @return
	 */
	abstract List<Destination> getAllRecords();

	/**
	 * Delete record
	 * @param warpName
	 * @return 
	 */	
	abstract Destination deleteRecord(String warpName);
	
	/**
	 * Close storage
	 */
	abstract void close();

	/**
	 * Sync datastore to disk if supported
	 */
	abstract void sync();
	
	/**
	 * Delete datastore
	 */
	abstract void delete();
	
	/**
	 * Check that datastore exists
	 * @return boolean
	 */
	abstract boolean exists();
	
	/**
	 * Get datastore filename or equivalent
	 * @return
	 */
	String getFilename() {
		return this.filename;
	}

	/**
	 * Get datastore type
	 */
	DataStoreType getType() {
		return this.type;
	}
	
	/**
	 * Get datastore name
	 * @return
	 */
	String getName() {
		return this.getType().toString();
	}

	/**
	 * Get datastore initialized field
	 * @return boolean
	 */
	boolean isInitialized() {
		return this.initialized;
	}
	
	/**
	 * Set initialized field
	 * @param initialized
	 */
	void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}
	
}
