package net.opentsdb.core;

import net.opentsdb.core.exception.DatastoreException;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 Created with IntelliJ IDEA.
 User: bhawkins
 Date: 2/14/13
 Time: 11:15 AM
 To change this template use File | Settings | File Templates.
 */
public class ExportTest
{
	@Test
	public void testExport() throws IOException, DatastoreException
	{
		File props = new File("opentsdb.properties");
		if (!props.exists())
			props = null;

		Main main = new Main(props);

		PrintStream ps = new PrintStream(new FileOutputStream("build/export.json"));
		main.export(ps);
		ps.close();
	}
}
