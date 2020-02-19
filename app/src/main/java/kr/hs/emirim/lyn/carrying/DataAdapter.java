//package kr.hs.emirim.lyn.carrying;
//
//import android.content.Context;
//import android.database.Cursor;
//import android.database.SQLException;
//import android.database.sqlite.SQLiteDatabase;
//import android.util.Log;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DataAdapter {
//    protected static final String TAG = "DataAdapter";
//
//    // TODO : TABLE 이름을 명시해야함
//    protected static final String TABLE_NAME = "total_list";
//
//    private final Context mContext;
//    private SQLiteDatabase mDb;
//    private DataBaseHelper mDbHelper;
//
//    public DataAdapter(Context context) {
//        this.mContext = context;
//        mDbHelper = new DataBaseHelper(mContext);
//    }
//
//    public DataAdapter createDatabase() throws SQLException {
//        try {
//            mDbHelper.createDataBase();
//        } catch (IOException mIOException) {
//            Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
//            throw new Error("UnableToCreateDatabase");
//        }
//        return this;
//    }
//
//    public DataAdapter open() throws SQLException {
//        try {
//            mDbHelper.openDataBase();
//            mDbHelper.close();
//            mDb = mDbHelper.getReadableDatabase();
//        } catch (SQLException mSQLException) {
//            Log.e(TAG, "open >>" + mSQLException.toString());
//            throw mSQLException;
//        }
//        return this;
//    }
//
//    public void close() {
//        mDbHelper.close();
//    }
//
//    public List getTableData() {
//        try {
//            // Table 이름 -> antpool_bitcoin 불러오기
//            String sql = "SELECT * FROM " + TABLE_NAME;
//
//            // 모델 넣을 리스트 생성
//            List userList = new ArrayList();
//
//            // TODO : 모델 선언
//            User user = null;
//
//            Cursor mCur = mDb.rawQuery(sql, null);
//            if (mCur != null) {
//                // 칼럼의 마지막까지
//                while (mCur.moveToNext()) {
//
//                    // TODO : 커스텀 모델 생성
//                    user = new User();
//
//                    // TODO : Record 기술
//                    // id, name, account, privateKey, secretKey, Comment
//                    user.setName(mCur.getString(0));
//                    user.setTheme(mCur.getInt(1));
//                    user.setGender(mCur.getInt(2));
//                    user.setWeather(mCur.getInt(3));
//
//                    userList.add(user);
//                }
//
//            }
//            return userList;
//        } catch (SQLException mSQLException) {
//            Log.e(TAG, "getTestData >>" + mSQLException.toString());
//            throw mSQLException;
//        }
//    }
//}
