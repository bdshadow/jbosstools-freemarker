package org.jboss.ide.eclipse.freemarker.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jboss.ide.eclipse.freemarker.editor.coloring.test.AssignColoringTest;
import org.jboss.ide.eclipse.freemarker.editor.coloring.test.EditInterpolationColoringTest;
import org.jboss.ide.eclipse.freemarker.editor.coloring.test.InterpolationColoringTest;
import org.jboss.ide.eclipse.freemarker.editor.coloring.test.ListColoringTest;
import org.jboss.ide.eclipse.freemarker.editor.test.FreemarkerEditorTest;
import org.jboss.ide.eclipse.freemarker.editor.test.IncludeHyperlinkDetectorTest;
import org.jboss.ide.eclipse.freemarker.editor.test.ErrorMarkerTest;
import org.jboss.ide.eclipse.freemarker.lang.test.ParserUtilsTest;
import org.jboss.ide.eclipse.freemarker.model.test.AssignmentDirectiveTest;
import org.jboss.ide.eclipse.freemarker.model.test.InterpolationTest;
import org.jboss.ide.eclipse.freemarker.model.test.ListDirectiveTest;
import org.jboss.ide.eclipse.freemarker.preferences.test.FreemarkerPreferencePageTest;
import org.jboss.tools.tests.AbstractPluginsLoadTest;

public class FreemarkerAllTests extends TestCase {

	public static Test suite ()
	{
		TestSuite suite = new TestSuite(FreemarkerAllTests.class.getName());
		suite.addTestSuite(FreemarkerPreferencePageTest.class);
		suite.addTestSuite(FreemarkerEditorTest.class);
		suite.addTestSuite(ParserUtilsTest.class);
	    suite.addTestSuite(ErrorMarkerTest.class);

		/* model tests */
		suite.addTestSuite(AssignmentDirectiveTest.class);
		suite.addTestSuite(ListDirectiveTest.class);
		suite.addTestSuite(InterpolationTest.class);

		/* coloring tests */
		suite.addTestSuite(AssignColoringTest.class);
		suite.addTestSuite(InterpolationColoringTest.class);
		suite.addTestSuite(ListColoringTest.class);
		suite.addTestSuite(EditInterpolationColoringTest.class);
		suite.addTestSuite(IncludeHyperlinkDetectorTest.class);
		return suite;
	}


	static public class FreemarkerPluginsLoadTest extends AbstractPluginsLoadTest {

		public FreemarkerPluginsLoadTest() {}

		public void testFreemarkerPluginsAreResolvedAndActivated() {
			testBundlesAreLoadedFor("org.jboss.ide.eclipse.freemarker.feature"); //$NON-NLS-1$
		}
	}
}
