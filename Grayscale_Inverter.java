import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.filter.*;

public class Grayscale_Inverter implements PlugInFilter {
	ImagePlus imp;

	public int setup(String arg, ImagePlus imp) {
		this.imp = imp;
		return DOES_8G;
	}

	public void run(ImageProcessor ip) {
		
		int w = ip.getWidth();
		int h = ip.getHeight();
	
		//iterate over image coordinates
		for ( int u = 0; u < w ; ++u) {

			for ( int v = 0; v < h; ++v) {

				int p = ip.get(u, v);
				ip.set(u, v, 255 - p);

			}

		}	


	}

}
