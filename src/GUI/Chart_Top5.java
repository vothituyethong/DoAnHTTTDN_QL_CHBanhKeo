package GUI;

import BLL.ChiTietHD_BLL;
import BLL.HDonBLL;
import DTO.ChiTietHD_DTO;
import DTO.HDonDTO;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart_Top5 extends JFrame{

    static ArrayList<ChiTietHD_DTO> arr = new ArrayList<ChiTietHD_DTO>();
    
    public Chart_Top5(){
        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(750, 367));
        chartPanel.setBackground(Color.PINK);
        JFrame frame = new JFrame();
        frame.add(chartPanel);        
        frame.setSize(1080,595);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        frame.setVisible(true);
    }
    public JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "TOP 5 MẶT HÀNG BÁN CHẠY NHẤT",
                "Tên hàng", "Doanh thu",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot plot = barChart.getCategoryPlot();

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.green);
        return barChart;
    }

    public CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
	ChiTietHD_BLL cthdBLL = new ChiTietHD_BLL();
	arr = cthdBLL.TK_Top5SP();
         ChiTietHD_DTO cthdDTO = new ChiTietHD_DTO();
        for (int i = 0; i < arr.size(); i++) {
            cthdDTO = arr.get(i);
            String name = cthdDTO.getMA_HANG();
            int tien = cthdDTO.getSO_LUONG();
            dataset.addValue(tien,"Doanh thu",name);
        }        
        return dataset;
    }
}