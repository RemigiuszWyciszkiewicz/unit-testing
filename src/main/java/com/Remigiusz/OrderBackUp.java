package com.Remigiusz;

import java.io.*;

public class OrderBackUp {

    Writer writer;

    void createFile() throws FileNotFoundException {
        File file=new File("roderbackup.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
        writer=new BufferedWriter(outputStreamWriter);
    }

    void closeFile() throws IOException {
        writer.close();
    }

    void backupOrder(Order order) throws IOException {
        writer.append(order.toString());
    }

    public Writer getWriter() {
        return writer;
    }
}
