package dev.hienph.toys;

import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

public class RocksDBMain {
  public static void main(String[] args) {
    RocksDB.loadLibrary();
    final var options = new Options().setCreateIfMissing(true);

    try (final var db = RocksDB.open(options, "./db/hello")) {
      final var key = "hello".getBytes();
      // final var value = "world".getBytes();
      // db.put(key, value);
      final var value = new String(db.get(key));
      System.out.println(value);
    } catch (RocksDBException e) {
      System.out.println(e);
    }
  }
}
