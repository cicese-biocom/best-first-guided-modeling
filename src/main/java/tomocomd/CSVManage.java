package tomocomd;

import weka.core.Instances;
import weka.core.converters.CSVLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.IntStream;

public class CSVManage {
  private static final String MSG_ACC = "Problems accessing to file %s";

  private CSVManage() {
    throw new IllegalStateException();
  }

  public static String saveDescriptorMResult(Instances instances, String pathOut)
      throws AExOpDCSException {
    File f = new File(pathOut);
    int cont = 0;
    while (f.exists()) {
      f = new File(String.format("%s_%d.csv", pathOut, ++cont));
    }
    try {
      PrintWriter pw = new PrintWriter(f);
      pw.print(instances.attribute(0).name());
      IntStream.range(1, instances.numAttributes())
          .forEach(i -> pw.print("," + instances.attribute(i).name()));
      pw.println();
      for (int i = 0; i < instances.numInstances(); i++) {
        double[] d = instances.instance(i).toDoubleArray();
        if (instances.attribute(0).isNominal()) {
          pw.print(instances.attribute(0).value((int) d[0]));
        } else {
          pw.print(d[0]);
        }
        IntStream.range(1, d.length)
            .forEach(
                j -> {
                  if (instances.attribute(j).isNominal()) {
                    pw.print(instances.attribute(j).value((int) d[j]));
                  } else {
                    pw.print("," + d[j]);
                  }
                });
        pw.println();
      }
      pw.close();
    } catch (FileNotFoundException ex) {
      throw AExOpDCSException.ExceptionType.CSV_FILE_WRITING_EXCEPTION.get(
          String.format("Problems writing the new subset in file:%s", pathOut), ex);
    }
    return f.getAbsolutePath();
  }

  public static Instances loadCSV(String path) throws AExOpDCSException {

    try {
      CSVLoader l = new CSVLoader();
      l.setFile(new File(path));
      l.setFieldSeparator(",");
      return l.getDataSet();
    } catch (IOException ex) {
      throw AExOpDCSException.ExceptionType.CSV_FILE_LOADING_EXCEPTION.get(
          String.format(MSG_ACC, path), ex);
    }
  }
}
