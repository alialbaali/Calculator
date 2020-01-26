package com.apps.calculator.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.apps.calculator.domain.Calculation;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CalculatorDao_Impl implements CalculatorDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCalculation;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCalculation;

  public CalculatorDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCalculation = new EntityInsertionAdapter<Calculation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `calculations`(`id`,`operation`,`result`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Calculation value) {
        stmt.bindLong(1, value.getId());
        if (value.getOperation() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOperation());
        }
        if (value.getResult() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResult());
        }
      }
    };
    this.__deletionAdapterOfCalculation = new EntityDeletionOrUpdateAdapter<Calculation>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `calculations` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Calculation value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Calculation calculation, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCalculation.insert(calculation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Calculation calculation, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCalculation.handle(calculation);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object get(final Continuation<? super List<Calculation>> p0) {
    final String _sql = "SELECT * from calculations";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Calculation>>() {
      @Override
      public List<Calculation> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOperation = CursorUtil.getColumnIndexOrThrow(_cursor, "operation");
          final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
          final List<Calculation> _result = new ArrayList<Calculation>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Calculation _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpOperation;
            _tmpOperation = _cursor.getString(_cursorIndexOfOperation);
            final String _tmpResult;
            _tmpResult = _cursor.getString(_cursorIndexOfResult);
            _item = new Calculation(_tmpId,_tmpOperation,_tmpResult);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
