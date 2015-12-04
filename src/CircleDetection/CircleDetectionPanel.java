package CircleDetection;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.opencv.core.Mat;

@SuppressWarnings("serial")
public class CircleDetectionPanel extends JPanel {

	public CircleDetectionPanel(int width, int height, String frameName) {
		JFrame frame = new JFrame(frameName);

		frame.add(this);
		
		this.setPreferredSize(new Dimension(width, height));

		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

		System.out.println("Panel Ready");
	}
}
