package org.openpnp.capture.library;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import java.nio.IntBuffer;

/**
 * JNA Wrapper for library <b>openpnp-capture</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface OpenpnpCaptureLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "openpnp-capture";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(OpenpnpCaptureLibrary.JNA_LIBRARY_NAME);
	//public static final OpenpnpCaptureLibrary INSTANCE = (OpenpnpCaptureLibrary) Native.loadLibrary(OpenpnpCaptureLibrary.JNA_LIBRARY_NAME, OpenpnpCaptureLibrary.class);
	public static final OpenpnpCaptureLibrary INSTANCE = Native.load(OpenpnpCaptureLibrary.JNA_LIBRARY_NAME, OpenpnpCaptureLibrary.class);
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_EXPOSURE = (int)1;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_FOCUS = (int)2;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_ZOOM = (int)3;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_WHITEBALANCE = (int)4;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_GAIN = (int)5;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_BRIGHTNESS = (int)6;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_CONTRAST = (int)7;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_SATURATION = (int)8;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_GAMMA = (int)9;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_HUE = (int)10;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_SHARPNESS = (int)11;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_BACKLIGHTCOMP = (int)12;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_POWERLINEFREQ = (int)13;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPPROPID_LAST = (int)14;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPRESULT_OK = (int)0;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPRESULT_ERR = (int)1;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPRESULT_DEVICENOTFOUND = (int)2;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPRESULT_FORMATNOTSUPPORTED = (int)3;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public static final int CAPRESULT_PROPERTYNOTSUPPORTED = (int)4;
	/** <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i> */
	public interface CapCustomLogFunc extends Callback {
		void apply(int level, Pointer string);
	};
	/**
	 * Initialize the capture library<br>
	 * @return The context ID.<br>
	 * Original signature : <code>CapContext Cap_createContext()</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:79</i>
	 */
	Pointer Cap_createContext();
	/**
	 * Un-initialize the capture library context<br>
	 * @param ctx The ID of the context to destroy.<br>
	 * @return The context ID.<br>
	 * Original signature : <code>CapResult Cap_releaseContext(CapContext)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:85</i>
	 */
	int Cap_releaseContext(Pointer ctx);
	/**
	 * Get the number of capture devices on the system.<br>
	 * note: this can change dynamically due to the<br>
	 * pluggin and unplugging of USB devices.<br>
	 * @param ctx The ID of the context.<br>
	 * @return The number of capture devices found.<br>
	 * Original signature : <code>uint32_t Cap_getDeviceCount(CapContext)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:93</i>
	 */
	int Cap_getDeviceCount(Pointer ctx);
	/**
	 * Get the name of a capture device.<br>
	 * This name is meant to be displayed in GUI applications,<br>
	 * i.e. its human readable.<br>
	 * if a device with the given index does not exist,<br>
	 * NULL is returned.<br>
	 * @param ctx The ID of the context.<br>
	 * @param index The device index of the capture device.<br>
	 * @return a pointer to an UTF-8 string containting the name of the capture device.<br>
	 * Original signature : <code>char* Cap_getDeviceName(CapContext, CapDeviceID)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:105</i>
	 */
	Pointer Cap_getDeviceName(Pointer ctx, int index);
	/**
	 * Get the unique name of a capture device.<br>
	 * The string contains a unique concatenation<br>
	 * of the device name and other parameters.<br>
	 * These parameters are platform dependent.<br>
	 * Note: when a USB camera does not expose a serial number,<br>
	 * platforms might have trouble uniquely identifying <br>
	 * a camera. In such cases, the USB port location can<br>
	 * be used to add a unique feature to the string.<br>
	 * This, however, has the down side that the ID of<br>
	 * the camera changes when the USB port location <br>
	 * changes. Unfortunately, there isn't much to<br>
	 * do about this.<br>
	 * if a device with the given index does not exist,<br>
	 * NULL is returned.<br>
	 * @param ctx The ID of the context.<br>
	 * @param index The device index of the capture device.<br>
	 * @return a pointer to an UTF-8 string containting the unique ID of the capture device.<br>
	 * Original signature : <code>char* Cap_getDeviceUniqueID(CapContext, CapDeviceID)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:127</i>
	 */
	Pointer Cap_getDeviceUniqueID(Pointer ctx, int index);
	/**
	 * Returns the number of formats supported by a certain device.<br>
	 * returns -1 if device does not exist.<br>
	 * @param ctx The ID of the context.<br>
	 * @param index The device index of the capture device.<br>
	 * @return The number of formats supported or -1 if the device does not exist.<br>
	 * Original signature : <code>int32_t Cap_getNumFormats(CapContext, CapDeviceID)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:137</i>
	 */
	int Cap_getNumFormats(Pointer ctx, int index);
	/**
	 * Get the format information from a device. <br>
	 * @param ctx The ID of the context.<br>
	 * @param index The device index of the capture device.<br>
	 * @param id The index/ID of the frame buffer format (0 .. number returned by Cap_getNumFormats() minus 1 ).<br>
	 * @param info pointer to a CapFormatInfo structure to be filled with data.<br>
	 * @return The CapResult.<br>
	 * Original signature : <code>CapResult Cap_getFormatInfo(CapContext, CapDeviceID, CapFormatID, CapFormatInfo*)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:146</i>
	 */
	int Cap_getFormatInfo(Pointer ctx, int index, int id, CapFormatInfo info);
	/**
	 * Open a capture stream to a device with specific format requirements <br>
	 * Although the (internal) frame buffer format is set via the fourCC ID,<br>
	 * the frames returned by Cap_captureFrame are always 24-bit RGB.<br>
	 * @param ctx The ID of the context.<br>
	 * @param index The device index of the capture device.<br>
	 * @param formatID The index/ID of the frame buffer format (0 .. number returned by Cap_getNumFormats() minus 1 ).<br>
	 * @return The stream ID or -1 if the device does not exist or the stream format ID is incorrect.<br>
	 * Original signature : <code>CapStream Cap_openStream(CapContext, CapDeviceID, CapFormatID)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:163</i>
	 */
	int Cap_openStream(Pointer ctx, int index, int formatID);
	/**
	 * Close a capture stream <br>
	 * @param ctx The ID of the context.<br>
	 * @param stream The stream ID.<br>
	 * @return CapResult<br>
	 * Original signature : <code>CapResult Cap_closeStream(CapContext, CapStream)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:170</i>
	 */
	int Cap_closeStream(Pointer ctx, int stream);
	/**
	 * Check if a stream is open, i.e. is capturing data. <br>
	 * @param ctx The ID of the context.<br>
	 * @param stream The stream ID.<br>
	 * @return 1 if the stream is open and capturing, else 0.<br>
	 * Original signature : <code>uint32_t Cap_isOpenStream(CapContext, CapStream)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:177</i>
	 */
	int Cap_isOpenStream(Pointer ctx, int stream);
	/**
	 * this function copies the most recent RGB frame data<br>
	 * to the given buffer.<br>
	 * Original signature : <code>CapResult Cap_captureFrame(CapContext, CapStream, void*, uint32_t)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:186</i>
	 */
	int Cap_captureFrame(Pointer ctx, int stream, Pointer RGBbufferPtr, int RGBbufferBytes);
	/**
	 * returns 1 if a new frame has been captured, 0 otherwise<br>
	 * Original signature : <code>uint32_t Cap_hasNewFrame(CapContext, CapStream)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:189</i>
	 */
	int Cap_hasNewFrame(Pointer ctx, int stream);
	/**
	 * returns the number of frames captured during the lifetime of the stream. <br>
	 * For debugging purposes<br>
	 * Original signature : <code>uint32_t Cap_getStreamFrameCount(CapContext, CapStream)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:193</i>
	 */
	int Cap_getStreamFrameCount(Pointer ctx, int stream);
	/**
	 * get the min/max limits and default value of a camera/stream property (e.g. zoom, exposure etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid.<br>
	 * Original signature : <code>CapResult Cap_getPropertyLimits(CapContext, CapStream, CapPropertyID, int32_t*, int32_t*, int*)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:206</i><br>
	 * @deprecated use the safer methods {@link #Cap_getPropertyLimits(com.sun.jna.Pointer, int, int, java.nio.IntBuffer, java.nio.IntBuffer, java.nio.IntBuffer)} and {@link #Cap_getPropertyLimits(com.sun.jna.Pointer, int, int, com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	int Cap_getPropertyLimits(Pointer ctx, int stream, int propID, IntByReference min, IntByReference max, IntByReference dValue);
	/**
	 * get the min/max limits and default value of a camera/stream property (e.g. zoom, exposure etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid.<br>
	 * Original signature : <code>CapResult Cap_getPropertyLimits(CapContext, CapStream, CapPropertyID, int32_t*, int32_t*, int*)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:206</i>
	 */
	int Cap_getPropertyLimits(Pointer ctx, int stream, int propID, IntBuffer min, IntBuffer max, IntBuffer dValue);
	/**
	 * set the value of a camera/stream property (e.g. zoom, exposure etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid.<br>
	 * Original signature : <code>CapResult Cap_setProperty(CapContext, CapStream, CapPropertyID, int32_t)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:215</i>
	 */
	int Cap_setProperty(Pointer ctx, int stream, int propID, int value);
	/**
	 * set the automatic flag of a camera/stream property (e.g. zoom, focus etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid.<br>
	 * Original signature : <code>CapResult Cap_setAutoProperty(CapContext, CapStream, CapPropertyID, uint32_t)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:223</i>
	 */
	int Cap_setAutoProperty(Pointer ctx, int stream, int propID, int bOnOff);
	/**
	 * get the value of a camera/stream property (e.g. zoom, exposure etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid or outValue == NULL.<br>
	 * Original signature : <code>CapResult Cap_getProperty(CapContext, CapStream, CapPropertyID, int32_t*)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:231</i><br>
	 * @deprecated use the safer methods {@link #Cap_getProperty(com.sun.jna.Pointer, int, int, java.nio.IntBuffer)} and {@link #Cap_getProperty(com.sun.jna.Pointer, int, int, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	int Cap_getProperty(Pointer ctx, int stream, int propID, IntByReference outValue);
	/**
	 * get the value of a camera/stream property (e.g. zoom, exposure etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid or outValue == NULL.<br>
	 * Original signature : <code>CapResult Cap_getProperty(CapContext, CapStream, CapPropertyID, int32_t*)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:231</i>
	 */
	int Cap_getProperty(Pointer ctx, int stream, int propID, IntBuffer outValue);
	/**
	 * get the automatic flag of a camera/stream property (e.g. zoom, focus etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid.<br>
	 * Original signature : <code>CapResult Cap_getAutoProperty(CapContext, CapStream, CapPropertyID, uint32_t*)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:239</i><br>
	 * @deprecated use the safer methods {@link #Cap_getAutoProperty(com.sun.jna.Pointer, int, int, java.nio.IntBuffer)} and {@link #Cap_getAutoProperty(com.sun.jna.Pointer, int, int, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	int Cap_getAutoProperty(Pointer ctx, int stream, int propID, IntByReference outValue);
	/**
	 * get the automatic flag of a camera/stream property (e.g. zoom, focus etc) <br>
	 * returns: CAPRESULT_OK if all is well.<br>
	 * CAPRESULT_PROPERTYNOTSUPPORTED if property not available.<br>
	 * CAPRESULT_ERR if context, stream are invalid.<br>
	 * Original signature : <code>CapResult Cap_getAutoProperty(CapContext, CapStream, CapPropertyID, uint32_t*)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:239</i>
	 */
	int Cap_getAutoProperty(Pointer ctx, int stream, int propID, IntBuffer outValue);
	/**
	 * Set the logging level.<br>
	 * LOG LEVEL ID  | LEVEL <br>
	 * ------------- | -------------<br>
	 * LOG_EMERG     | 0<br>
	 * LOG_ALERT     | 1<br>
	 * LOG_CRIT      | 2<br>
	 * LOG_ERR       | 3<br>
	 * LOG_WARNING   | 4<br>
	 * LOG_NOTICE    | 5<br>
	 * LOG_INFO      | 6    <br>
	 * LOG_DEBUG     | 7<br>
	 * LOG_VERBOSE   | 8<br>
	 * Original signature : <code>void Cap_setLogLevel(uint32_t)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:261</i>
	 */
	void Cap_setLogLevel(int level);
	/**
	 * install a custom callback for a logging function.<br>
	 * the callback function must have the following <br>
	 * structure:<br>
	 * void func(uint32_t level, const char *string);<br>
	 * Original signature : <code>void Cap_installCustomLogFunction(CapCustomLogFunc)</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:273</i>
	 */
	void Cap_installCustomLogFunction(OpenpnpCaptureLibrary.CapCustomLogFunc logFunc);
	/**
	 * Return the version of the library as a string.<br>
	 * In addition to a version number, this should <br>
	 * contain information on the platform,<br>
	 * e.g. Win32/Win64/Linux32/Linux64/OSX etc,<br>
	 * wether or not it is a release or debug<br>
	 * build and the build date.<br>
	 * When building the library, please set the <br>
	 * following defines in the build environment:<br>
	 * __LIBVER__<br>
	 * __PLATFORM__<br>
	 * __BUILDTYPE__<br>
	 * Original signature : <code>char* Cap_getLibraryVersion()</code><br>
	 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h:291</i>
	 */
	Pointer Cap_getLibraryVersion();
}
