// Part of Hookless: https://hookless.machinezoo.com
import com.machinezoo.stagean.*;

/**
 * Reactive versions of classes from {@link java.util.prefs}.
 * See {@link com.machinezoo.hookless.prefs} package.
 */
@StubDocs
@NoTests
@DraftApi
module com.machinezoo.hookless.prefs {
	exports com.machinezoo.hookless.prefs;
	requires com.machinezoo.hookless;
	/*
	 * Preferences should be moved to separate library along with this dependency.
	 */
	requires transitive java.prefs;
	requires com.machinezoo.stagean;
	requires com.google.common;
	/*
	 * Default ReactivePreferencesFactory can be configured via SPI just like PreferencesFactory.
	 */
	uses com.machinezoo.hookless.prefs.ReactivePreferencesFactory;
}
