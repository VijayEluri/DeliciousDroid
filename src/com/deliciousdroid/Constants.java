/*
 * DeliciousDroid - http://code.google.com/p/DeliciousDroid/
 *
 * Copyright (C) 2010 Matt Schmidt
 *
 * DeliciousDroid is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * DeliciousDroid is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DeliciousDroid; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */

package com.deliciousdroid;

import android.net.Uri;

public class Constants {

    /**
     * Account type string.
     */
    public static final String ACCOUNT_TYPE = "com.deliciousdroid";
    
    public static final Uri CONTENT_URI_BASE = Uri.parse("content://com.deliciousdroid");
    
    public static final String CONTENT_SCHEME = "content";
    
    public static final String EXTRA_DESCRIPTION = "com.deliciousdroid.bookmark.description";
    public static final String EXTRA_NOTES = "com.deliciousdroid.bookmark.notes";
    public static final String EXTRA_TAGS = "com.deliciousdroid.bookmark.tags";
    public static final String EXTRA_PRIVATE = "com.deliciousdroid.bookmark.private";
    public static final String EXTRA_ERROR = "com.deliciousdroid.bookmark.error";
    public static final String EXTRA_TIME = "com.deliciousdroid.bookmark.time";
	public static final String EXTRA_UPDATE = "com.deliciousdroid.bookmark.update";
	
	public static final String TEXT_EXTRACTOR_URL = "http://viewtext.org/api/text?url=";
	
	public static final String SYNC_MARKER_KEY = "com.deliciousdroid.BookmarkSyncAdapter.marker";
	
	public static final int BOOKMARK_PAGE_SIZE = 500;
	
	public static final String ACTION_SEARCH_SUGGESTION = "com.deliciousdroid.intent.action.SearchSuggestion";
	
	public static final String SUGGEST_COLUMN_TEXT_2_URL = "suggest_text_2_url";

    /**
     * Authtoken type string.
     */
    public static final String AUTHTOKEN_TYPE = "com.deliciousdroid";
    
    public static final String AUTH_PREFS_NAME = "com.deliciousdroid.auth";
    
    public static final String PREFS_AUTH_TYPE = "authentication_type";
    public static final String AUTH_TYPE_DELICIOUS = "delicious";
    
    public static final String GPL_URL = "http://www.gnu.org/licenses/gpl-3.0.txt";
    public static final String MANUAL_URL = "http://code.google.com/p/deliciousdroid/wiki/Manual";
    public static final String DONATION_URL = "https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=6ERJRC6SWL9ZC";
    
    public static enum BookmarkViewType {VIEW, READ, WEB};
}