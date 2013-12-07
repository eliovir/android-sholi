/*
 * ShoLi, a simple tool to produce short (shopping) lists.
 *
 * Copyright (C) 2013  David Soulayrol
 *
 * ShoLi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ShoLi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package name.soulayrol.rhaa.sholi.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * The ShoLi data model.
 */
public interface Sholi {

    public static final String AUTHORITY = "name.soulayrol.rhaa.sholi.provider";

    public static final String TAG = "ShoLi";

    /**
     * The table for the list items.
     */
    public interface Item extends BaseColumns {

        public static final String TABLE = "items";

        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE);

        /**
         * The item name (what else?).
         */
        public static final String KEY_NAME = "item";

        /**
         * Whether an item is off list, on list, or checked.
         */
        public static final String KEY_STATUS = "status";

        /**
         * The value of the status for items which are not part of the list.
         */
        public static final int OFF_LIST = 0;

        /**
         * The value of the status for items which are listed and still not checked.
         */
        public static final int UNCHECKED = 1;

        /**
         * The value of the status for items which are listed and checked.
         */
        public static final int CHECKED = 2;
    }
}
