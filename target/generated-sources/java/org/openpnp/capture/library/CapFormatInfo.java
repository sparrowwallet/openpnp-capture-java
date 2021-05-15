package org.openpnp.capture.library;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /Users/romanvg/dev/openpnp-capture/include/openpnp-capture.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CapFormatInfo extends Structure {
	/** < width in pixels */
	public int width;
	/** < height in pixels */
	public int height;
	/** < fourcc code (platform dependent) */
	public int fourcc;
	/** < frames per second */
	public int fps;
	/** < bits per pixel */
	public int bpp;
	public CapFormatInfo() {
		super();
	}
	protected List<java.lang.String> getFieldOrder() {
		return Arrays.asList("width", "height", "fourcc", "fps", "bpp");
	}
	/**
	 * @param width < width in pixels<br>
	 * @param height < height in pixels<br>
	 * @param fourcc < fourcc code (platform dependent)<br>
	 * @param fps < frames per second<br>
	 * @param bpp < bits per pixel
	 */
	public CapFormatInfo(int width, int height, int fourcc, int fps, int bpp) {
		super();
		this.width = width;
		this.height = height;
		this.fourcc = fourcc;
		this.fps = fps;
		this.bpp = bpp;
	}
	public CapFormatInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CapFormatInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CapFormatInfo implements Structure.ByValue {
		
	};
}
