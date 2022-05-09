package GUI;

import BLL.HDonBLL;
import DTO.HDonDTO;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart_DoanhThuNV extends JFrame{

    static ArrayList<HDonDTO> arr = new ArrayList<HDonDTO>();
    public String maNV;
    public Frm_NhanVienBH frm_NVBH;
    
    public Chart_DoanhThuNV(){
        
    }
    public void Init(){
        this.maNV = frm_NVBH.manv;        
        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
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
                "THỐNG KÊ DOANH THU CỦA NHÂN VIÊN",
                "Ngày", "Số tiền",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot plot = barChart.getCategoryPlot();

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.blue);
        return barChart;
    }

    public CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
	HDonBLL hdBLL = new HDonBLL();
	arr = hdBLL.TK_DoanhThuNV(maNV);
        HDonDTO hdDTO = new HDonDTO();
	for (int i = 0; i < arr.size(); i++) {
            hdDTO = arr.get(i);
            Date date = hdDTO.getNGAY_LAP();
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
            String stringDate= DateFor.format(date);
            int tien=hdDTO.getTONG_TIEN();
            dataset.addValue(tien,"Số tiền",stringDate);
	}        
        return dataset;
    }
}