package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class MainFrame extends JFrame
{
	private  JTabbedPane myJTabbedPanel;
	//private CurrencyConverter currencyConverter;
	//private TemperatureConverter temperatureConverter;
	public MainFrame()
	{
		this.setSize(1080,720);
		this.setLocation(420,180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(1,1));
		this.getContentPane().add(createJTabbedPanel());
		this.setVisible(true);
	}


	private JTabbedPane createJTabbedPanel()
	{
		if (myJTabbedPanel==null)
		{
			myJTabbedPanel = new JTabbedPane(JTabbedPane.LEFT );
			MyBasicTabbedPaneUI myBasicTabbedPaneUI = new MyBasicTabbedPaneUI();
			myJTabbedPanel.setUI(myBasicTabbedPaneUI);
			//temperatureConverter = new TemperatureConverter();
			//JComponent panell = makeTextPanel("CurrencyConverter;");
			//myJTabbedPanel.addTab("CurrencyConverter",temperatureConverter);
			JComponent panel2 = makeTextPanel("temperatureConverter;");
			myJTabbedPanel.add("temperatureConverter",panel2);

		}


		return  myJTabbedPanel;
	}

	private JComponent makeTextPanel(String text)
	{
		JPanel panel=new JPanel(false);
		JLabel filler=new JLabel(text);
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1,1));
		panel.add(filler);
		return panel;
	}


	class MyBasicTabbedPaneUI extends BasicTabbedPaneUI
	{
		@Override
		protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
			return super.calculateTabWidth(tabPlacement, tabIndex, metrics)+30;
		}

		@Override
		protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight)
		{
			return super.calculateTabHeight(tabPlacement, tabIndex, fontHeight)+80;
		}
	}

}
/* 重写函数 增加高度 */
