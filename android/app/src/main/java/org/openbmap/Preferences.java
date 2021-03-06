/*
	Radiobeacon - Openbmap wifi and cell logger
    Copyright (C) 2013  wish7

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.openbmap;

/**
 * Stores settings keys and default values.
 * See preferences.xml for layout, strings-preferences.xml for text.
 */
public final class Preferences {
	// 'Button id' Advanced settings
	public static final String KEY_ADVANCED_SETTINGS = "advanced_settings";

	public static final String KEY_GPS_LOGGING_INTERVAL = "gps.interval";
	// TODO add support for external (e.g. bluetooth gps provider)
	public static final String KEY_GPS_PROVIDER = "gps.provider";
	
	public static final String KEY_MAP_FOLDER = "data.folder_map";
	public static final String KEY_WIFI_CATALOG_FOLDER = "data.folder_catalog";
	
	/**
	 * Selected map file
	 */
	public static final String KEY_MAP_FILE = "data.map";

	/**
	 * Map download button
	 */
	public static final String KEY_DOWNLOAD_MAP = "data.download";	
	
	/**
	 * Wifi catalog download button
	 */
	public static final String KEY_DOWNLOAD_WIFI_CATALOG = "data.download_wifi_catalog";
	
	/**
	 * Selected wifi catalog file
	 */
	public static final String KEY_WIFI_CATALOG_FILE = "data.ref_database";
	
	/**
	 * Keeps screen on during logging?
	 */
	public static final String KEY_KEEP_SCREEN_ON = "ui.keep_screen_on";
	
	/**
	 * Openbmap user name
	 */
	public static final String KEY_CREDENTIALS_USER = "credentials.user";
	
	/**
	 * Openbmap password
	 */
	public static final String KEY_CREDENTIALS_PASSWORD = "credentials.password";
	
	/**
	 * Shall cells be saved?
	 */
	public static final String KEY_LOG_CELLS = "save_cells";
	
	/**
	 * Shall wifis be saved?
	 */
	public static final String KEY_LOG_WIFIS = "save_wifis";
	
	/**
	 * Minimum distance between cells logged.
	 */
	public static final String KEY_MIN_CELL_DISTANCE = "logging.cell_distance";
	
	/**
	 * Minimum distance between wifis logged.
	 */
	public static final String KEY_MIN_WIFI_DISTANCE = "logging.wifi_distance";
	
	/**
	 * Required GPS accuracy
	 */
	public static final String KEY_REQ_GPS_ACCURACY = "logging.gps_accuracy";
	
	/**
	 * Simulate upload only?
	 */
	public static final String	KEY_SKIP_UPLOAD = "debug.simulate_upload";
	
	/**
	 * Clean database button
	 */
	public static final String	KEY_CLEAN_DATABASE = "debug.clean_database";
	
	/**
	 * Update wifi catalog button
	 */
	public static final String KEY_UPDATE_CATALOG = "debug.update_catalog";
	
	/**
	 * Keep local temp files after upload?
	 */
	public static final String KEY_SKIP_DELETE = "debug.keep_export_files";
	
	/**
	 * Blocks wifi and cell scan around current location
	 */
	public static final String KEY_BLOCK_HOMEZONE = "privacy.block_homezone";
	
	/**
	 * Replace SSIDS by md5 hash on upload
	 */
	public static final String KEY_ANONYMISE_SSID = "privacy.anonymise_ssid";

    /**
     * Ignore battery warnings
     */
    public static final String KEY_IGNORE_BATTERY = "ignore_battery";

	/*
	 * Default values following ..
	 */

    /**
     * Default: stop tracking on low battery
     */
    public static final boolean VAL_IGNORE_BATTERY = false;


    /**
	 * No map set
	 */
	public static final String VAL_MAP_NONE = "none";
	
	/**
	 * Default map file name
	 */
	public static final String VAL_MAP_FILE = VAL_MAP_NONE;
	
	/**
	 * Default reference database filename
	 */
	public static final String VAL_WIFI_CATALOG_FILE = "openbmap.sqlite";
	
	/**
	 * Reference database not set 
	 */
	public static final String VAL_WIFI_CATALOG_NONE = "none";
	
	/**
	 * Default minimum distance cells
	 */
	public static final String VAL_MIN_CELL_DISTANCE = "35";
	
	/**
	 * Default minimum distance wifis
	 */
	public static final String VAL_MIN_WIFI_DISTANCE = "5";
	
	/**
	 * Default GPS accuracy
	 */
	public static final String VAL_REQ_GPS_ACCURACY = "25";
	
	/**
	 * Default screen lock settings
	 */
	public static final boolean VAL_KEY_KEEP_SCREEN_ON = true;
	
	/**
	 * By default upload session
	 */
	public static final boolean	VAL_SKIP_UPLOAD = false;
	
	/**
	 * By default delete local temp files after upload
	 */
	public static final boolean	VAL_SKIP_DELETE = false;
	
	/**
	 * Save cells by default
	 */
	public static final boolean VAL_SAVE_CELLS = true;
	
	/**
	 * Save wifis by default
	 */
	public static final boolean VAL_SAVE_WIFIS = true;

	/**
	 * GPS update frequence in seconds, 0 = update position as often as possible by default
	 */
	public static final String VAL_GPS_LOGGING_INTERVAL = "0";
	
	/**
	 * Don't anonymise SSIDS by default
	 */
	public static final boolean VAL_ANONYMISE_SSID = false;
	
	/**
	 * Default maps folder name, relative to application root dir.
	 * Can be overwritten in settings by specifying KEY_MAP_FOLDER
	 */
	public static final String MAPS_SUBDIR = "maps";
	
	/**
	 * Default wifi catalog folder name, relative to application root dir.
	 * Can be overwritten in settings by specifying KEY_WIFI_CATALOG_FOLDER
	 */
	public static final String WIFI_CATALOG_SUBDIR = "databases";
	
	/**
	 * Directory containing wifi blacklists, relative to application root dir.
	 */
	public static final String BLACKLIST_SUBDIR = "blacklists";
	/**
	 * File extension for maps
	 */
	public static final String MAP_FILE_EXTENSION = ".map";
	
	/**
	 * File extension for wifi catalog
	 */
	public static final String WIFI_CATALOG_FILE_EXTENSION = ".sqlite";
	
	/**
	 * File extension for wifi and cell log files
	 */
	public static final String LOG_FILE_EXTENSION = ".xml";
	
	/**
	 * URL, where wifi catalog with openbmap's preprocessed wifi positions can be downloaded
	 */
	public static final String	WIFI_CATALOG_DOWNLOAD_URL = "http://www.radiocells.org/static/openbmap.sqlite";
	
	/**
	 * Filename catalog database
	 */
	public static final String WIFI_CATALOG_FILE = "openbmap.sqlite";
	
	/**
	 * URL, which is called to check whether this client version is up-to-date
	 */
	public static final String VERSION_CHECK_URL = "http://radiocells.org/uploads/version.xml";

    /**
     * URL, which is called to validate user credentials
     */
	public static final String PASSWORD_VALIDATION_URL = "http://radiocells.org/uploads/check_login";


	/**
	 * Private dummy constructor
	 */
	private Preferences() {
	
	}
}