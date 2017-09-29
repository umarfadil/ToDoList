package com.umarfadil.todolist.db;

import android.provider.BaseColumns;

/**
 * Created by umarfadil on 9/29/17.
 */

public class TaskContract {
    public static final String DB_NAME = "com.umarfadil.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "mytask";

        public static final String COL_TASK_TITLE = "title";
    }
}
