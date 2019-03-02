package ru.smartsarov.bus;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class Props {
  private Props() {
  }
  public static Properties get() {
    Properties props = new Properties();

    try (FileInputStream f = new FileInputStream("c:/conf/bus/bus.conf")) {
      props.load(f);
    } catch (IOException ex) {
      ex.printStackTrace(); // handle an exception here
    }
    return props;
  }
}