package com.keyuan.orangeStationTwo.orangeStationTwoNext.demo;
import com.cohere.orange.gui.OrangeMain;
import com.cohere.orange.gui.dialog.AdpEditDialog;
import com.cohere.orange.gui.entity.AdpConfigInfo;
import com.keyuan.orangeStationTwo.orangeStationTwoControl.common.util.PropUtils;
import com.keyuan.orangeStationTwo.orangeStationTwoNext.model.ControlDataTwoCupModel;
import com.keyuan.orangeStationTwo.orangeStationTwoNext.model.ControlDataTwoRobotModel;
import com.keyuan.orangeStationTwo.orangeStationTwoNext.model.MotorParameterSettingCommandModelTwo;
import com.zhongjinfeng.util.helper.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @Author: xiehaodong
 * @Date: 2022/1/5 - 15:14
 * @Description: com.keyuan.orangeStationTwo.demo
 * @version: 1.0
 */

public class OrangeStationTwoDemo {
    private static final Logger logger = LoggerFactory.getLogger(OrangeStationTwoDemo.class);
    private static OrangeStationTwoDemo orangeStationTwoDemo;
    private static MiddlewareUtilTwoDemo middlewareUtilTwoDemo;

    public static void main(String[] args) {
        //加载配置文件
        loadProps();
        orangeStationTwoDemo = new OrangeStationTwoDemo();
        middlewareUtilTwoDemo = new MiddlewareUtilTwoDemo(orangeStationTwoDemo);
        middlewareUtilTwoDemo.startDemoServer();
        orangeStationTwoDemo.frameInit();
    }

    /**
     * 设置配置文件路径，并从配置文件读取循环扫描数据库等待时间配置信息
     *
     * @return 读取循环扫描数据库等待时间成功标志
     */
    public static boolean loadProps() {
        try {
            // 设置配置文件路径
            logger.info("设置配置文件路径。");
            PropUtils.setPropFile("OrangeStationTwo.json");
        } catch (Exception ex) {
            logger.error("从配置文件读取配置失败，请检查配置项目是否都存在。", ex);
            return false;
        }
        return true;
    }
    // 占位置的
    static JPanel first_zero, second_zero, third_zero, first, second, thrid, fourth, fifth, sixth, send, select;
    static JPanel em, em_emJpanel, em_sencodJpanel, em_useJpanel;
    static JPanel two, two_twoJpanel, two_sencodJpanel, two_useJpanel;
    static JPanel three, three_threeJpanel, three_sencondJpanel, three_useJpanel;
    static JPanel four, four_fourJpanel, four_sencondJpanel, four_useJpanel;
    static JPanel five, five_threeJpanel, five_sencondJpanel, five_useJpanel;
    static JPanel six, six_threeJpanel, six_sencondJpanel, six_useJpanel;
    static JPanel seven, seven_sevenJpanel, seven_sencondJpanel, seven_useJpanel;
    static JPanel eight, eight_eightJpanel, eight_sencondJpanel, eight_useJpanel;
    static JPanel nine, nine_nineJpanel, nine_sencondJpanel, nine_useJpanel;
    static JPanel ten, ten_tenJpanel, ten_sencondJpanel, ten_useJpanel;
    static JPanel eleven, eleven_elevenJpanel, eleven_sencondJpanel, eleven_useJpanel;
    static JPanel twelve, twelve_twelveJpanel, twelve_sencondJpanel, twelve_useJpanel;
    static JPanel thirteen, thirteen_thirteenJpanel, thirteen_sencondJpanel, thirteen_useJpanel;
    static JPanel fourteen, fourteen_fourteenJpanel, fourteen_sencondJpanel, fourteen_useJpanel;
    static JPanel fourteenone, fourteenone_fourteenJpanel, fourteenone_sencondJpanel, fourteenone_useJpanel;
    static JPanel fifteen, fifteen_fifteenJpanel, fifteen_sencondJpanel, fifteen_useJpanel;
    static JPanel sixteen, sixteen_sixteenJpanel, sixteen_sencondJpanel, sixteen_useJpanel;
    static JPanel seventeen, seventeen_seventeenJpanel, seventeen_sencondJpanel, seventeen_useJpanel;
    static JPanel eighteen, eighteen_eighteenJpanel, eighteen_sencondJpanel, eighteen_useJpanel;
    static JPanel nineteen, nineteen_nineteenJpanel, nineteen_sencondJpanel, nineteen_useJpanel;
    static JPanel twenty, twenty_twentyJpanel, twenty_sencondJpanel, twenty_useJpanel;
    static JPanel twentyone, twentyone_twentyoneJpanel, twentyone_sencondJpanel, twentyone_useJpanel;
    static JPanel twentytwo, twentytwo_twentytwoJpanel, twentytwo_sencondJpanel, twentytwo_useJpanel;
    static JPanel twentythree, twentythree_twentythreeJpanel, twentythree_sencondJpanel, twentythree_useJpanel;
    static JPanel twentyfour, twentyfour_twentyfourJpanel, twentyfour_sencondJpanel, twentyfour_useJpanel;
    static JPanel twentyfour_one, twentyfour_one_twentyfourJpanel, twentyfour_one_sencondJpanel, twentyfour_one_useJpanel;
    static JPanel twentyfour_two, twentyfour_two_twentyfourJpanel, twentyfour_two_sencondJpanel, twentyfour_two_useJpanel;
    static JPanel twentyfour_three, twentyfour_three_twentyfourJpanel, twentyfour_three_sencondJpanel, twentyfour_three_useJpanel;
    static JPanel twentyfour_four, twentyfour_four_twentyfourJpanel, twentyfour_four_sencondJpanel, twentyfour_four_useJpanel;
    static JPanel twentyfour_five, twentyfour_five_twentyfourJpanel, twentyfour_five_sencondJpanel, twentyfour_five_useJpanel;
    static JPanel twentyfour_five_one, twentyfour_five_one_twentyfourJpanel, twentyfour_five_one_sencondJpanel, twentyfour_five_one_useJpanel;
    static JPanel twentyfour_five_two, twentyfour_five_two_twentyfourJpanel, twentyfour_five_two_sencondJpanel, twentyfour_five_two_useJpanel;
    static JPanel twentyfour_six, twentyfour_six_twentyfourJpanel, twentyfour_six_sencondJpanel, twentyfour_six_useJpanel;
    // 文字或文本所在容器
    static JPanel first_firstJPanel, first_secondJPanel, second_firstJPanel,
            second_secondJPanel, thrid_firstJPanel, thrid_secondJPanel, fourth_firstJPanel, fourth_secondJPanel,
            fifth_firstJPanel, fifth_secondJPanel, sixth_firstJPanel, sixth_secondJPanel;
    // 所占宽度
    static int average_width = 1260 / 3;
    // 提示按钮
    static JButton prompt_jButton;
    // 占位置
    static JPanel useless_third_jPanel;
    // 占位置
    static JPanel myuseless_first_jPanel, myuseless_second_jPanel, myuseless_third_jPanel, myuseless_fourth_jPanel,
            myuseless_fifth_jPanel, myuseless_sixth_jPanel, myuseless_seventh_jPanel;
    JList jList_statusresquery;
    JList jList_statusresquery2;
    JList jList_statusresquery_robot;
    JList jList_statusresBiaoding;
    JList jList_statusres, jList_statusres_robot;
    JList jList_statusres2;
    static int i = 1;
    public JFrame frame;
    JList secondJList = new JList();
    public JLabel middle_lab2 = new JLabel();
    public List secondList = new ArrayList<String>();
    JScrollPane secondJScrollPane = new JScrollPane();

    Font font = new Font("宋体", Font.PLAIN, 15);
    GridBagConstraints c = new GridBagConstraints();
    static int number = 0;

    {
        c.insets = new Insets(5, 15, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
    }

    // 判断状态查询命令是否是点击按钮
    public int statusBtn = 0;
    //查询控制
    JTextField motorControlCommand_posi_jTextField1, motorControlCommand_posi_jTextField1_2, motorControlCommand_posi_jTextField1_3, motorControlCommand_posi_jTextField1_4, motorControlCommand_posi_jTextField1_5,
            motorControlCommand_posi_jTextField1_6, motorControlCommand_posi_jTextField1_7, motorControlCommand_posi_jTextField1_8, motorControlCommand_posi_jTextField1_81, motorControlCommand_posi_jTextField1_82, motorControlCommand_posi_jTextField1_9, motorControlCommand_posi_jTextField1_10, motorControlCommand_posi_jTextField1_11,
            motorControlCommand_posi_jTextField1_12, motorControlCommand_posi_jTextField1_13, motorControlCommand_posi_jTextField1_14, motorControlCommand_posi_jTextField1_141, motorControlCommand_posi_jTextField1_15, motorControlCommand_posi_jTextField1_16, motorControlCommand_posi_jTextField1_17,
            motorControlCommand_posi_jTextField1_18, motorControlCommand_posi_jTextField1_19, motorControlCommand_posi_jTextField1_20, motorControlCommand_posi_jTextField1_21, motorControlCommand_posi_jTextField1_22, em_reset_jtext, em_reset_jtext2,
            motorControlCommand_posi_jTextField1_23, motorControlCommand_posi_jTextField1_24, motorControlCommand_posi_jTextField1_25, motorControlCommand_posi_jTextField1_26, motorControlCommand_posi_jTextField1_27, motorControlCommand_posi_jTextField1_28, motorControlCommand_posi_jTextField1_271, motorControlCommand_posi_jTextField1_272,
            motorControlCommand_posi_jTextField1_2_robot, motorControlCommand_posi_jTextField1_3_robot, motorControlCommand_posi_jTextField1_4_robot, motorControlCommand_posi_jTextField1_5_robot, motorControlCommand_posi_jTextField1_6_robot, motorControlCommand_posi_jTextField1_7_robot;
    JLabel versionLab;

    private static void InitGlobalFont(Font font) {
        FontUIResource fontRes = new FontUIResource(font);
        for (Enumeration<Object> keys = UIManager.getDefaults().keys(); keys.hasMoreElements(); ) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) {
                UIManager.put(key, fontRes);
            }
        }
    }

    public void frameInit() {
        InitGlobalFont(new Font("alias", Font.PLAIN, 18));
        // 创建选项卡面板
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("状态查询命令", statusQueryCommand());
        jTabbedPane.addTab("标定位置查询命令", biaodingStatusQueryCommand());
        jTabbedPane.addTab("夹爪移液电机控制命令", motorControlCommand());
        jTabbedPane.addTab("标定位置设置命令", gripperControlCommand());
        jTabbedPane.addTab("电机参数读取命令", motorParameterReadingCommand());
        jTabbedPane.addTab("电机参数设置命令", motorParameterSettingCommand());
        jTabbedPane.addTab("查询及控制", selectOrControl());
//        jTabbedPane.addTab("机器手查询及控制", robotSelectOrControl());
        //jTabbedPane.addTab("机器手状态查询命令", robotStatusQueryCommand());
        frame = new JFrame("orange2舱分杯舱单步测试v1.2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(jTabbedPane, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setBounds(100, 100, 1460, 900);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
            }
        });
    }

    /**
     * 创建一个面板,用于显示线选项卡 '状态查询命令' 需要显示的内容
     *
     * @return
     */
    public JComponent statusQueryCommand() {
        // 创建面板
        JPanel mainPanel = new JPanel();
        // --------------------------------状态查询命令------------------------------//
        JPanel statusQueryCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_second_jPanel = new JPanel(new BorderLayout());
        JPanel statusQueryCommand_third_jPanel = new JPanel(new BorderLayout());
        JLabel statusQueryCommand_jLabel = new JLabel("状态查询命令测试");
        statusQueryCommand_jLabel.setForeground(Color.red);

        JButton statusQueryCommand_jButton = new JButton("状态查询命令");
        statusQueryCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                statusBtn = 0;
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.statusRequestINIT();
                logger.info("发送状态查询命令！");
            }
        });
        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        statusQueryCommand_first_jPanel.add(myuseless_first_jPanel);
        statusQueryCommand_first_jPanel.add(statusQueryCommand_jLabel);
        statusQueryCommand_first_jPanel.setPreferredSize(new Dimension(1460, 28));
        statusQueryCommand_jPanel.add(statusQueryCommand_first_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        myuseless_third_jPanel.add(statusQueryCommand_jButton);
        statusQueryCommand_jButton.setPreferredSize(new Dimension(160, 30));
        myuseless_third_jPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(120, 30));
        statusQueryCommand_second_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_second_jPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        statusQueryCommand_second_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_second_jPanel.setPreferredSize(new Dimension(1460, 50));
        statusQueryCommand_jPanel.add(statusQueryCommand_second_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));

        jList_statusresquery = new JList<>(new String[]{""});
        JScrollPane jScrollPane = new JScrollPane(jList_statusresquery);
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(120, 30));
        statusQueryCommand_third_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_third_jPanel.add(jScrollPane, BorderLayout.CENTER);
        statusQueryCommand_third_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_third_jPanel.setPreferredSize(new Dimension(1460, 600));
        jScrollPane.setPreferredSize(new Dimension(1460, 590));

        // JLabel label=new JLabel("拉升到付款打开随时随刻");
        // jScrollPane.add(jList);
        statusQueryCommand_third_jPanel.setBackground(Color.RED);
        // statusQueryCommand_jPanel.add(statusQueryCommand_third_jPanel);

        statusQueryCommand_jPanel.setPreferredSize(new Dimension(1460, 80));
        mainPanel.add(statusQueryCommand_jPanel);
        mainPanel.add(statusQueryCommand_third_jPanel);
        // mainPanel.add(label);
        // -----------------------------------------------------------------------//
        return mainPanel;
    }


    /**
     * 创建一个面板,用于显示线选项卡 '状态查询命令' 需要显示的内容
     *
     * @return
     */
    public JComponent robotStatusQueryCommand() {
        // 创建面板
        JPanel mainPanel = new JPanel();
        // --------------------------------状态查询命令------------------------------//
        JPanel statusQueryCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_second_jPanel = new JPanel(new BorderLayout());
        JPanel statusQueryCommand_third_jPanel = new JPanel(new BorderLayout());
        JLabel statusQueryCommand_jLabel = new JLabel("状态查询命令测试");
        statusQueryCommand_jLabel.setForeground(Color.red);

        JButton statusQueryCommand_jButton = new JButton("状态查询命令");
        statusQueryCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                statusBtn = 0;
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.statusRequestINIT();
                logger.info("发送状态查询命令！");
            }
        });
        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        statusQueryCommand_first_jPanel.add(myuseless_first_jPanel);
        statusQueryCommand_first_jPanel.add(statusQueryCommand_jLabel);
        statusQueryCommand_first_jPanel.setPreferredSize(new Dimension(1460, 28));
        statusQueryCommand_jPanel.add(statusQueryCommand_first_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        myuseless_third_jPanel.add(statusQueryCommand_jButton);
        statusQueryCommand_jButton.setPreferredSize(new Dimension(160, 30));
        myuseless_third_jPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(120, 30));
        statusQueryCommand_second_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_second_jPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        statusQueryCommand_second_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_second_jPanel.setPreferredSize(new Dimension(1460, 50));
        statusQueryCommand_jPanel.add(statusQueryCommand_second_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));

        jList_statusresquery_robot = new JList<>(new String[]{""});
        JScrollPane jScrollPane = new JScrollPane(jList_statusresquery_robot);
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(120, 30));
        statusQueryCommand_third_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_third_jPanel.add(jScrollPane, BorderLayout.CENTER);
        statusQueryCommand_third_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_third_jPanel.setPreferredSize(new Dimension(1460, 600));
        jScrollPane.setPreferredSize(new Dimension(1460, 590));

        // JLabel label=new JLabel("拉升到付款打开随时随刻");
        // jScrollPane.add(jList);
        statusQueryCommand_third_jPanel.setBackground(Color.RED);
        // statusQueryCommand_jPanel.add(statusQueryCommand_third_jPanel);

        statusQueryCommand_jPanel.setPreferredSize(new Dimension(1460, 80));
        mainPanel.add(statusQueryCommand_jPanel);
        mainPanel.add(statusQueryCommand_third_jPanel);
        // mainPanel.add(label);
        // -----------------------------------------------------------------------//
        return mainPanel;
    }


    /**
     * 创建一个面板,用于显示线选项卡 '查询及控制命令' 需要显示的内容
     *
     * @return
     */
    public JComponent selectOrControl() {
        JPanel mainPanel = new JPanel();
        // --------------------------------查询及控制命令------------------------------//
        JButton sendCommand_jButton = new JButton("发送控制命令");
        sendCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                ControlDataTwoCupModel controlDataTwoCupModel = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel();
                //夹爪序号
                String clipSeq = motorControlCommand_posi_jTextField1_2.getText();
                if (!StringHelper.isEmpty(clipSeq)) {
                    controlDataTwoCupModel.setClipSeq(Integer.parseInt(clipSeq));
                }
                //抓管源位置
                String clipFromStation = motorControlCommand_posi_jTextField1_3.getText();
                if (!StringHelper.isEmpty(clipFromStation)) {
                    controlDataTwoCupModel.setClipFromStation(Integer.parseInt(clipFromStation));
                }
                //抓管目标位置
                String clipToStation = motorControlCommand_posi_jTextField1_4.getText();
                if (!StringHelper.isEmpty(clipToStation)) {
                    controlDataTwoCupModel.setClipToStation(Integer.parseInt(clipToStation));
                }
                //抓管动作完成后夹爪停靠位置
                String clipEndStation = motorControlCommand_posi_jTextField1_5.getText();
                if (!StringHelper.isEmpty(clipEndStation)) {
                    controlDataTwoCupModel.setClipEndStation(Integer.parseInt(clipEndStation));
                }
                //移液动作序号
                String yiyeSeq = motorControlCommand_posi_jTextField1_6.getText();
                if (!StringHelper.isEmpty(yiyeSeq)) {
                    controlDataTwoCupModel.setYiyeSeq(Integer.parseInt(yiyeSeq));
                }
                //移液目标板位位置
                String yiyeStation = motorControlCommand_posi_jTextField1_7.getText();
                if (!StringHelper.isEmpty(yiyeStation)) {
                    controlDataTwoCupModel.setYiyeStation(Integer.parseInt(yiyeStation));
                }
                //移液动作
                String yiyeAction = motorControlCommand_posi_jTextField1_8.getText();
                if (!StringHelper.isEmpty(yiyeAction)) {
                    controlDataTwoCupModel.setYiyeAction(Integer.parseInt(yiyeAction));
                }
                //多吸多排序号(混合次数)
                String yiyePaiyeAction = motorControlCommand_posi_jTextField1_9.getText();
                if (!StringHelper.isEmpty(yiyePaiyeAction)) {
                    controlDataTwoCupModel.setYiyePaiyeSeq(Integer.parseInt(yiyePaiyeAction));
                }
                //液位探测
                String liquidFlag = motorControlCommand_posi_jTextField1_10.getText();
                if (!StringHelper.isEmpty(liquidFlag)) {
                    controlDataTwoCupModel.setLiquidFlag(Integer.parseInt(liquidFlag));
                }
                //移液量
                String yiyeNum = motorControlCommand_posi_jTextField1_11.getText();
                if (!StringHelper.isEmpty(yiyeNum)) {
                    controlDataTwoCupModel.setYiyeNum(Integer.parseInt(yiyeNum));
                }
                //搬运动作序号
                String carryMoveSeq = motorControlCommand_posi_jTextField1_12.getText();
                if (!StringHelper.isEmpty(carryMoveSeq)) {
                    controlDataTwoCupModel.setCarryMoveSeq(Integer.parseInt(carryMoveSeq));
                }
                //搬运目标位置
                String carryMoveStation = motorControlCommand_posi_jTextField1_13.getText();
                if (!StringHelper.isEmpty(carryMoveStation)) {
                    controlDataTwoCupModel.setCarryMoveStation(Integer.parseInt(carryMoveStation));
                }
                //搬运动作完成后停靠位置
                String carryMoveEndStation = motorControlCommand_posi_jTextField1_14.getText();
                if (!StringHelper.isEmpty(carryMoveEndStation)) {
                    controlDataTwoCupModel.setCarryMoveEndStation(Integer.parseInt(carryMoveEndStation));
                }
                //旋盖动作序号
                String coverSeq = motorControlCommand_posi_jTextField1_15.getText();
                if (!StringHelper.isEmpty(coverSeq)) {
                    controlDataTwoCupModel.setCoverSeq(Integer.parseInt(coverSeq));
                }
                //旋盖动作
                String coverAction = motorControlCommand_posi_jTextField1_16.getText();
                if (!StringHelper.isEmpty(coverAction)) {
                    controlDataTwoCupModel.setCoverAction(Integer.parseInt(coverAction));
                }
                //扫码开启
                String scanFlag = motorControlCommand_posi_jTextField1_17.getText();
                if (!StringHelper.isEmpty(scanFlag)) {
                    controlDataTwoCupModel.setScanFlag(Integer.parseInt(scanFlag));
                }
                //抓管三轴定位序号
                String clipMoveSeq = motorControlCommand_posi_jTextField1_18.getText();
                if (!StringHelper.isEmpty(clipMoveSeq)) {
                    controlDataTwoCupModel.setClipMoveSeq(Integer.parseInt(clipMoveSeq));
                }
                //抓管三轴定位位置
                String clipMoveStation = motorControlCommand_posi_jTextField1_19.getText();
                if (!StringHelper.isEmpty(clipMoveStation)) {
                    controlDataTwoCupModel.setClipMoveStation(Integer.parseInt(clipMoveStation));
                }
                //移液三轴定位序号
                String yiyeMoveSeq = motorControlCommand_posi_jTextField1_20.getText();
                if (!StringHelper.isEmpty(yiyeMoveSeq)) {
                    controlDataTwoCupModel.setYiyeMoveSeq(Integer.parseInt(yiyeMoveSeq));
                }
                //移液三轴定位位置
                String yiyeMoveStation = motorControlCommand_posi_jTextField1_21.getText();
                if (!StringHelper.isEmpty(yiyeMoveStation)) {
                    controlDataTwoCupModel.setYiyeMoveStation(Integer.parseInt(yiyeMoveStation));
                }

                //升降台动作序号
                String platfromSeq = motorControlCommand_posi_jTextField1_23.getText();
                if (!StringHelper.isEmpty(platfromSeq)) {
                    controlDataTwoCupModel.setPlatfrom1Seq(Integer.parseInt(platfromSeq));
                }

                String platfrom1Station = motorControlCommand_posi_jTextField1_24.getText();
                if (!StringHelper.isEmpty(platfrom1Station)) {
                    controlDataTwoCupModel.setPlatform1Station(Integer.parseInt(platfrom1Station));
                }
                String platfrom2Station = motorControlCommand_posi_jTextField1_25.getText();
                if (!StringHelper.isEmpty(platfrom2Station)) {
                    controlDataTwoCupModel.setPlatform2Station(Integer.parseInt(platfrom2Station));
                }
                String platfrom2seq = motorControlCommand_posi_jTextField1_28.getText();
                if (!StringHelper.isEmpty(platfrom2seq)) {
                    controlDataTwoCupModel.setPlatfrom2Seq(Integer.parseInt(platfrom2seq));
                }
                String robotXSeq = motorControlCommand_posi_jTextField1_26.getText();
                if (!StringHelper.isEmpty(robotXSeq)) {
                    controlDataTwoCupModel.setRobotXSeq(Integer.parseInt(robotXSeq));
                }
                String robotXToStation = motorControlCommand_posi_jTextField1_27.getText();
                if (!StringHelper.isEmpty(robotXToStation)) {
                    controlDataTwoCupModel.setRobotXToStation(Integer.parseInt(robotXToStation));
                }
                String shutDownSeq = motorControlCommand_posi_jTextField1_271.getText();
                if (!StringHelper.isEmpty(shutDownSeq)) {
                    controlDataTwoCupModel.setShutDownSeq(Integer.parseInt(shutDownSeq));
                }
//                String shutDownSecond = motorControlCommand_posi_jTextField1_272.getText();
//                if (!StringHelper.isEmpty(shutDownSecond)) {
//                    controlDataTwoCupModel.setShutDownSecond(Integer.parseInt(shutDownSecond));
//                }
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.statusRequest(controlDataTwoCupModel);
            }
        });


        // 发送控制父容器
        send = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        send.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        send.setPreferredSize(new Dimension(450, 1508));
        JScrollPane jScrollPane2 = new JScrollPane(send);
        jScrollPane2.setPreferredSize(new Dimension(450, 748));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(30);
        mainPanel.add(jScrollPane2);

        // 查询父容器
        select = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        select.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        select.setPreferredSize(new Dimension(950, 748));
        mainPanel.add(select);

        JButton em_reset = new JButton("电机复位");
        em_reset.setFont(font);
        em_reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // TODO Auto-generated method stub
                JDialog jFrame = new JDialog();
                jFrame.setTitle("电机复位");
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setLayout(null);
                prompt_message_jPanel.setPreferredSize(new Dimension(450, 1248));
                JScrollPane jScrollPane = new JScrollPane(prompt_message_jPanel);
                jScrollPane.setPreferredSize(new Dimension(200, 400));
                jScrollPane.getVerticalScrollBar().setUnitIncrement(30);

                JLabel jLabel23 = new JLabel("BIT23 0");
                jLabel23.setBounds(10, 1160, 390, 20);
                prompt_message_jPanel.add(jLabel23);

                JLabel jLabel22 = new JLabel("BIT22 预留");
                jLabel22.setBounds(10, 1100, 390, 20);
                prompt_message_jPanel.add(jLabel22);


                JLabel jLabel21 = new JLabel("BIT21 预留");
                jLabel21.setBounds(10, 1060, 390, 20);
                prompt_message_jPanel.add(jLabel21);

                JLabel jLabel20 = new JLabel("BIT20 预留");
                jLabel20.setBounds(10, 1010, 390, 20);
                prompt_message_jPanel.add(jLabel20);

                JLabel jLabel19 = new JLabel("BIT19 预留");
                jLabel19.setBounds(10, 960, 390, 20);
                prompt_message_jPanel.add(jLabel19);

                JLabel jLabel18 = new JLabel("BIT18 参数报警复位");
                jLabel18.setBounds(10, 910, 390, 20);
                prompt_message_jPanel.add(jLabel18);

                JLabel jLabel17 = new JLabel("BIT17 预留");
                jLabel17.setBounds(10, 860, 390, 20);
                prompt_message_jPanel.add(jLabel17);

                JLabel jLabel16 = new JLabel("BIT16 移液枪复位");
                jLabel16.setBounds(10, 810, 390, 20);
                prompt_message_jPanel.add(jLabel16);

                JLabel jLabel15 = new JLabel("BIT15 0");
                jLabel15.setBounds(10, 760, 390, 20);
                prompt_message_jPanel.add(jLabel15);

                JLabel jLabel14 = new JLabel("BIT14 夹爪三轴X轴电机复位 0：不复位 1：复位");
                jLabel14.setBounds(10, 710, 390, 20);
                prompt_message_jPanel.add(jLabel14);

                JLabel jLabel13 = new JLabel("BIT13 夹爪三轴Y1轴电机复位 0：不复位 1：复位");
                jLabel13.setBounds(10, 660, 390, 20);
                prompt_message_jPanel.add(jLabel13);

                JLabel jLabel12 = new JLabel("BIT12 夹爪三轴Y2轴电机复位 0：不复位 1：复位");
                jLabel12.setBounds(10, 610, 390, 20);
                prompt_message_jPanel.add(jLabel12);

                JLabel jLabel11 = new JLabel("BIT11 夹爪三轴Z轴电机复位 0：不复位 1：复位");
                jLabel11.setBounds(10, 560, 390, 20);
                prompt_message_jPanel.add(jLabel11);

                JLabel jLabel10 = new JLabel("BIT10 移液三轴X电机复位 0：不复位 1：复位");
                jLabel10.setBounds(10, 510, 390, 20);
                prompt_message_jPanel.add(jLabel10);

                JLabel jLabel9 = new JLabel("BIT9 移液三轴Y轴电机复位 0：不复位 1：复位");
                jLabel9.setBounds(10, 460, 390, 20);
                prompt_message_jPanel.add(jLabel9);

                JLabel jLabel8 = new JLabel("BIT8 移液三轴Z电机复位");
                jLabel8.setBounds(10, 410, 390, 20);
                prompt_message_jPanel.add(jLabel8);

                JLabel jLabel7 = new JLabel("BIT7 0 ");
                jLabel7.setBounds(10, 360, 390, 20);
                prompt_message_jPanel.add(jLabel7);

                JLabel jLabel6 = new JLabel("BIT6  门电机");
                jLabel6.setBounds(10, 310, 390, 20);
                prompt_message_jPanel.add(jLabel6);

                JLabel jLabel5 = new JLabel("BIT5 搬动四轴R轴(下舱卡紧电机)");
                jLabel5.setBounds(10, 260, 390, 20);
                prompt_message_jPanel.add(jLabel5);

                JLabel jLabel4 = new JLabel("BIT4 搬动四轴X轴(下舱三轴X轴)");
                jLabel4.setBounds(10, 210, 390, 20);
                prompt_message_jPanel.add(jLabel4);

                JLabel jLabel3 = new JLabel("BIT3 搬动四轴Y轴(下舱三轴Y轴)");
                jLabel3.setBounds(10, 160, 390, 20);
                prompt_message_jPanel.add(jLabel3);

                JLabel jLabel2 = new JLabel("BIT2 搬动四轴Z轴(下舱三轴Z轴)");
                jLabel2.setBounds(10, 110, 390, 20);
                prompt_message_jPanel.add(jLabel2);

                JLabel jLabel1 = new JLabel("BIT1 旋转夹爪复位 0：不复位 1：复位");
                jLabel1.setBounds(10, 60, 390, 20);
                prompt_message_jPanel.add(jLabel1);

                JLabel jLabel0 = new JLabel("BIT0 固定夹爪复位 0：不复位 1：复位");
                jLabel0.setBounds(10, 10, 390, 20);
                prompt_message_jPanel.add(jLabel0);

                JTextField jText23 = new JTextField();
                jText23.setBounds(410, 1160, 230, 30);
                prompt_message_jPanel.add(jText23);
                int resetBit23 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit23();
                jText23.setText(resetBit23 + "");

                JTextField jText22 = new JTextField();
                jText22.setBounds(410, 1110, 230, 30);
                prompt_message_jPanel.add(jText22);
                int resetBit22 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit22();
                jText22.setText(resetBit22 + "");

                JTextField jText21 = new JTextField();
                jText21.setBounds(410, 1060, 230, 30);
                prompt_message_jPanel.add(jText21);
                int resetBit21 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit21();
                jText21.setText(resetBit21 + "");

                JTextField jText20 = new JTextField();
                jText20.setBounds(410, 1010, 230, 30);
                prompt_message_jPanel.add(jText20);
                int resetBit20 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit20();
                jText20.setText(resetBit20 + "");

                JTextField jText19 = new JTextField();
                jText19.setBounds(410, 960, 230, 30);
                prompt_message_jPanel.add(jText19);
                int resetBit19 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit19();
                jText19.setText(resetBit19 + "");

                JTextField jText18 = new JTextField();
                jText18.setBounds(410, 910, 230, 30);
                prompt_message_jPanel.add(jText18);
                int resetBit18 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit18();
                jText18.setText(resetBit18 + "");

                JTextField jText17 = new JTextField();
                jText17.setBounds(410, 860, 230, 30);
                prompt_message_jPanel.add(jText17);
                int resetBit17 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit17();
                jText17.setText(resetBit17 + "");

                JTextField jText16 = new JTextField();
                jText16.setBounds(410, 810, 230, 30);
                prompt_message_jPanel.add(jText16);
                int resetBit16 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit16();
                jText16.setText(resetBit16 + "");

                JTextField jText15 = new JTextField();
                jText15.setBounds(410, 760, 230, 30);
                prompt_message_jPanel.add(jText15);
                int resetBit15 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit19();
                jText15.setText(resetBit15 + "");

                JTextField jText14 = new JTextField();
                jText14.setBounds(410, 710, 230, 30);
                prompt_message_jPanel.add(jText14);
                int resetBit14 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit14();
                jText14.setText(resetBit14 + "");

                JTextField jText13 = new JTextField();
                jText13.setBounds(410, 660, 230, 30);
                prompt_message_jPanel.add(jText13);
                int resetBit13 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit13();
                jText13.setText(resetBit13 + "");

                JTextField jText12 = new JTextField();
                jText12.setBounds(410, 610, 230, 30);
                prompt_message_jPanel.add(jText12);
                int resetBit12 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit12();
                jText12.setText(resetBit12 + "");

                JTextField jText11 = new JTextField();
                jText11.setBounds(410, 560, 230, 30);
                prompt_message_jPanel.add(jText11);
                int resetBit11 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit11();
                jText11.setText(resetBit11 + "");

                JTextField jText10 = new JTextField();
                jText10.setBounds(410, 510, 230, 30);
                prompt_message_jPanel.add(jText10);
                int resetBit10 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit10();
                jText10.setText(resetBit10 + "");

                JTextField jText09 = new JTextField();
                jText09.setBounds(410, 460, 230, 30);
                prompt_message_jPanel.add(jText09);
                int resetBit9 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit9();
                jText09.setText(resetBit9 + "");

                JTextField jText08 = new JTextField();
                jText08.setBounds(410, 410, 230, 30);
                prompt_message_jPanel.add(jText08);
                int resetBit8 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit8();
                jText08.setText(resetBit18 + "");

                JTextField jText07 = new JTextField();
                jText07.setBounds(410, 360, 230, 30);
                prompt_message_jPanel.add(jText07);
                int resetBit7 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit7();
                jText07.setText(resetBit7 + "");

                JTextField jText06 = new JTextField();
                jText06.setBounds(410, 310, 230, 30);
                prompt_message_jPanel.add(jText06);
                int resetBit6 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit6();
                jText06.setText(resetBit6 + "");

                JTextField jText05 = new JTextField();
                jText05.setBounds(410, 260, 230, 30);
                prompt_message_jPanel.add(jText05);
                int resetBit5 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit5();
                jText05.setText(resetBit5 + "");

                JTextField jText04 = new JTextField();
                jText04.setBounds(410, 210, 230, 30);
                prompt_message_jPanel.add(jText04);
                int resetBit4 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit4();
                jText04.setText(resetBit4 + "");

                JTextField jText03 = new JTextField();
                jText03.setBounds(410, 160, 230, 30);
                prompt_message_jPanel.add(jText03);
                int resetBit3 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit3();
                jText03.setText(resetBit3 + "");

                JTextField jText02 = new JTextField();
                jText02.setBounds(410, 110, 230, 30);
                prompt_message_jPanel.add(jText02);
                int resetBit2 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit2();
                jText02.setText(resetBit2 + "");

                JTextField jText01 = new JTextField();
                jText01.setBounds(410, 60, 230, 30);
                prompt_message_jPanel.add(jText01);
                int resetBit1 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit1();
                jText01.setText(resetBit1 + "");

                JTextField jText0 = new JTextField();
                jText0.setBounds(410, 10, 230, 30);
                prompt_message_jPanel.add(jText0);
                int resetBit0 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getResetBit0();
                jText0.setText(resetBit0 + "");

                JButton jButton = new JButton("确定");
                jButton.setBounds(480, 1200, 160, 30);
                prompt_message_jPanel.add(jButton);
                jButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        String jtext23 = jText23.getText();
                        String jtext22 = jText22.getText();
                        String jtext21 = jText21.getText();
                        String jtext20 = jText20.getText();
                        String jtext19 = jText19.getText();
                        String jtext18 = jText18.getText();
                        String jtext17 = jText17.getText();
                        String jtext16 = jText16.getText();
                        String jtext15 = jText15.getText();
                        String jtext14 = jText14.getText();
                        String jtext13 = jText13.getText();
                        String jtext12 = jText12.getText();
                        String jtext11 = jText11.getText();
                        String jtext10 = jText10.getText();
                        String jtext09 = jText09.getText();
                        String jtext08 = jText08.getText();
                        String jtext07 = jText07.getText();
                        String jtext06 = jText06.getText();
                        String jtext05 = jText05.getText();
                        String jtext04 = jText04.getText();
                        String jtext03 = jText03.getText();
                        String jtext02 = jText02.getText();
                        String jtext01 = jText01.getText();
                        String jtext0 = jText0.getText();
                        em_reset_jtext.setText(jtext0 + jtext01 + jtext02 + jtext03 + jtext04 + jtext05 + jtext06 + jtext07 + jtext08 + jtext09 + jtext10 + jtext11 + jtext12 +
                                jtext13 + jtext14 + jtext15 + jtext16 + jtext17 + jtext18 + jtext19 + jtext20 + jtext21 + jtext22 + jtext23);
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit23(Integer.parseInt(jtext23));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit22(Integer.parseInt(jtext22));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit21(Integer.parseInt(jtext21));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit20(Integer.parseInt(jtext20));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit19(Integer.parseInt(jtext19));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit18(Integer.parseInt(jtext18));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit17(Integer.parseInt(jtext17));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit16(Integer.parseInt(jtext16));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit15(Integer.parseInt(jtext15));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit14(Integer.parseInt(jtext14));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit13(Integer.parseInt(jtext13));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit12(Integer.parseInt(jtext12));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit11(Integer.parseInt(jtext11));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit10(Integer.parseInt(jtext10));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit9(Integer.parseInt(jtext09));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit8(Integer.parseInt(jtext08));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit7(Integer.parseInt(jtext07));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit6(Integer.parseInt(jtext06));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit5(Integer.parseInt(jtext05));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit4(Integer.parseInt(jtext04));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit3(Integer.parseInt(jtext03));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit2(Integer.parseInt(jtext02));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit1(Integer.parseInt(jtext01));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setResetBit0(Integer.parseInt(jtext0));
                        jFrame.setVisible(false);
                        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }
                });

                jFrame.add(jScrollPane);
                jFrame.setVisible(true);
                jFrame.setBounds(200, 200, 860, 760);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        JLabel motorControlCommand_num_jLabel_2 = new JLabel("抓管动作序号");
        motorControlCommand_num_jLabel_2.setFont(font);

        JLabel motorControlCommand_num_jLabel_3 = new JLabel("抓管源位置");
        motorControlCommand_num_jLabel_3.setFont(font);

        JLabel motorControlCommand_num_jLabel_4 = new JLabel("抓管目标位置");
        motorControlCommand_num_jLabel_4.setFont(font);

        JLabel motorControlCommand_num_jLabel_5 = new JLabel("抓管动作完成后夹爪停靠位置");
        motorControlCommand_num_jLabel_5.setFont(font);

        JLabel motorControlCommand_num_jLabel_6 = new JLabel("移液动作序号");
        motorControlCommand_num_jLabel_6.setFont(font);

        JLabel motorControlCommand_num_jLabel_7 = new JLabel("移液目标位置");
        motorControlCommand_num_jLabel_7.setFont(font);

        JLabel motorControlCommand_num_jLabel_8 = new JLabel("移液动作");
        motorControlCommand_num_jLabel_8.setFont(font);

        JLabel motorControlCommand_num_jLabel_9 = new JLabel("多吸多排序号(混合次数)");
        motorControlCommand_num_jLabel_9.setFont(font);

        JLabel motorControlCommand_num_jLabel_10 = new JLabel("液位探测");
        motorControlCommand_num_jLabel_10.setFont(font);

        JLabel motorControlCommand_num_jLabel_11 = new JLabel("移液量");
        motorControlCommand_num_jLabel_11.setFont(font);

        JLabel motorControlCommand_num_jLabel_12 = new JLabel("搬运动作序号");
        motorControlCommand_num_jLabel_12.setFont(font);

        JLabel motorControlCommand_num_jLabel_13 = new JLabel("搬运目标位置");
        motorControlCommand_num_jLabel_13.setFont(font);

        JLabel motorControlCommand_num_jLabel_14 = new JLabel("搬运动作完成后停靠位置");
        motorControlCommand_num_jLabel_14.setFont(font);

        JLabel motorControlCommand_num_jLabel_15 = new JLabel("旋盖动作序号");
        motorControlCommand_num_jLabel_15.setFont(font);

        JLabel motorControlCommand_num_jLabel_16 = new JLabel("旋盖动作");
        motorControlCommand_num_jLabel_16.setFont(font);

        JLabel motorControlCommand_num_jLabel_17 = new JLabel("扫码开启");
        motorControlCommand_num_jLabel_17.setFont(font);

        JLabel motorControlCommand_num_jLabel_18 = new JLabel("抓管三轴定位序号");
        motorControlCommand_num_jLabel_18.setFont(font);

        JLabel motorControlCommand_num_jLabel_19 = new JLabel("抓管三轴定位位置");
        motorControlCommand_num_jLabel_19.setFont(font);

        JLabel motorControlCommand_num_jLabel_20 = new JLabel("移液三轴定位序号");
        motorControlCommand_num_jLabel_20.setFont(font);

        JLabel motorControlCommand_num_jLabel_21 = new JLabel("移液三轴定位位置");
        motorControlCommand_num_jLabel_21.setFont(font);

        JButton motorControlCommand_num_jLabel_22 = new JButton("IO控制");
        motorControlCommand_num_jLabel_22.setFont(font);

        JLabel motorControlCommand_num_jLabel_23 = new JLabel("升降台1动作序号");
        motorControlCommand_num_jLabel_23.setFont(font);

        JLabel motorControlCommand_num_jLabel_24 = new JLabel("升降台1位置");
        motorControlCommand_num_jLabel_24.setFont(font);

        JLabel motorControlCommand_num_jLabel_28 = new JLabel("升降台2动作序号");
        motorControlCommand_num_jLabel_28.setFont(font);

        JLabel motorControlCommand_num_jLabel_25 = new JLabel("升降台2位置");
        motorControlCommand_num_jLabel_25.setFont(font);

        JLabel motorControlCommand_num_jLabel_26 = new JLabel("机械手X轴序号");
        motorControlCommand_num_jLabel_26.setFont(font);

        JLabel motorControlCommand_num_jLabel_27 = new JLabel("机械手X轴动作目标位置");
        motorControlCommand_num_jLabel_27.setFont(font);

        JLabel motorControlCommand_num_jLabel_271 = new JLabel("试管类型");
        motorControlCommand_num_jLabel_271.setFont(font);

        JLabel motorControlCommand_num_jLabel_272 = new JLabel("关机倒计时/秒");
        motorControlCommand_num_jLabel_272.setFont(font);

        motorControlCommand_num_jLabel_22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JDialog jFrame = new JDialog();
                jFrame.setTitle("IO控制");
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setLayout(null);
                prompt_message_jPanel.setPreferredSize(new Dimension(450, 868));
                JScrollPane jScrollPane = new JScrollPane(prompt_message_jPanel);
                jScrollPane.setPreferredSize(new Dimension(200, 400));
                jScrollPane.getVerticalScrollBar().setUnitIncrement(30);


                JLabel jLabel0 = new JLabel("BIT0 报警灯红灯 0：灭 1：亮");
                jLabel0.setBounds(10, 10, 390, 20);
                prompt_message_jPanel.add(jLabel0);

                JLabel jLabel1 = new JLabel("BIT1 报警灯黄灯 0：灭 1：亮");
                jLabel1.setBounds(10, 60, 390, 20);
                prompt_message_jPanel.add(jLabel1);

                JLabel jLabel2 = new JLabel("BIT2 报警灯绿灯 0：灭 1：亮");
                jLabel2.setBounds(10, 110, 390, 20);
                prompt_message_jPanel.add(jLabel2);

                JLabel jLabel3 = new JLabel("BIT3 报警灯蓝灯 0：灭 1：亮");
                jLabel3.setBounds(10, 160, 390, 20);
                prompt_message_jPanel.add(jLabel3);

                JLabel jLabel4 = new JLabel("BIT4 报警灯白灯 0：灭 1：亮");
                jLabel4.setBounds(10, 210, 390, 20);
                prompt_message_jPanel.add(jLabel4);

                JLabel jLabel5 = new JLabel("BIT5 报警灯蜂鸣器 0：灭 1：亮");
                jLabel5.setBounds(10, 260, 390, 20);
                prompt_message_jPanel.add(jLabel5);

                JLabel jLabel6 = new JLabel("BIT6 预留");
                jLabel6.setBounds(10, 310, 390, 20);
                prompt_message_jPanel.add(jLabel6);

                JLabel jLabel7 = new JLabel("BIT7 0 ");
                jLabel7.setBounds(10, 360, 390, 20);
                prompt_message_jPanel.add(jLabel7);

                JLabel jLabel8 = new JLabel("BIT8 预留");
                jLabel8.setBounds(10, 410, 390, 20);
                prompt_message_jPanel.add(jLabel8);

                JLabel jLabel9 = new JLabel("BIT9 预留");
                jLabel9.setBounds(10, 460, 390, 20);
                prompt_message_jPanel.add(jLabel9);

                JLabel jLabel10 = new JLabel("BIT10 预留");
                jLabel10.setBounds(10, 510, 390, 20);
                prompt_message_jPanel.add(jLabel10);

                JLabel jLabel11 = new JLabel("BIT11 预留");
                jLabel11.setBounds(10, 560, 390, 20);
                prompt_message_jPanel.add(jLabel11);

                JLabel jLabel12 = new JLabel("BIT12 紫外灯 0：OFF 1：ON");
                jLabel12.setBounds(10, 610, 390, 20);
                prompt_message_jPanel.add(jLabel12);

                JLabel jLabel13 = new JLabel("BIT13 预留");
                jLabel13.setBounds(10, 660, 390, 20);
                prompt_message_jPanel.add(jLabel13);

                JLabel jLabel14 = new JLabel("BIT14 预留");
                jLabel14.setBounds(10, 710, 390, 20);
                prompt_message_jPanel.add(jLabel14);

                JLabel jLabel15 = new JLabel("BIT15 0");
                jLabel15.setBounds(10, 760, 390, 20);
                prompt_message_jPanel.add(jLabel15);

                JTextField jText0 = new JTextField();
                jText0.setBounds(410, 10, 230, 30);
                prompt_message_jPanel.add(jText0);
                int ioCodeBit0 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit0();
                jText0.setText(ioCodeBit0 + "");

                JTextField jText01 = new JTextField();
                jText01.setBounds(410, 60, 230, 30);
                prompt_message_jPanel.add(jText01);
                int ioCodeBit1 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit1();
                jText01.setText(ioCodeBit1 + "");

                JTextField jText02 = new JTextField();
                jText02.setBounds(410, 110, 230, 30);
                prompt_message_jPanel.add(jText02);
                int ioCodeBit2 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit2();
                jText02.setText(ioCodeBit2 + "");

                JTextField jText03 = new JTextField();
                jText03.setBounds(410, 160, 230, 30);
                prompt_message_jPanel.add(jText03);
                int ioCodeBit3 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit3();
                jText03.setText(ioCodeBit3 + "");

                JTextField jText04 = new JTextField();
                jText04.setBounds(410, 210, 230, 30);
                prompt_message_jPanel.add(jText04);
                int ioCodeBit4 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit4();
                jText04.setText(ioCodeBit4 + "");

                JTextField jText05 = new JTextField();
                jText05.setBounds(410, 260, 230, 30);
                prompt_message_jPanel.add(jText05);
                int ioCodeBit5 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit5();
                jText05.setText(ioCodeBit5 + "");

                JTextField jText06 = new JTextField();
                jText06.setBounds(410, 310, 230, 30);
                prompt_message_jPanel.add(jText06);
                int ioCodeBit6 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit6();
                jText06.setText(ioCodeBit6 + "");

                JTextField jText07 = new JTextField();
                jText07.setBounds(410, 360, 230, 30);
                prompt_message_jPanel.add(jText07);
                int ioCodeBit7 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit7();
                jText07.setText(ioCodeBit7 + "");

                JTextField jText08 = new JTextField();
                jText08.setBounds(410, 410, 230, 30);
                prompt_message_jPanel.add(jText08);
                int ioCodeBit8 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit8();
                jText08.setText(ioCodeBit8 + "");

                JTextField jText09 = new JTextField();
                jText09.setBounds(410, 460, 230, 30);
                prompt_message_jPanel.add(jText09);
                int ioCodeBit9 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit9();
                jText09.setText(ioCodeBit9 + "");

                JTextField jText10 = new JTextField();
                jText10.setBounds(410, 510, 230, 30);
                prompt_message_jPanel.add(jText10);
                int ioCodeBit10 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit10();
                jText10.setText(ioCodeBit10 + "");

                JTextField jText11 = new JTextField();
                jText11.setBounds(410, 560, 230, 30);
                prompt_message_jPanel.add(jText11);
                int ioCodeBit11 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit11();
                jText11.setText(ioCodeBit11 + "");

                JTextField jText12 = new JTextField();
                jText12.setBounds(410, 610, 230, 30);
                prompt_message_jPanel.add(jText12);
                int ioCodeBit12 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit12();
                jText12.setText(ioCodeBit12 + "");

                JTextField jText13 = new JTextField();
                jText13.setBounds(410, 660, 230, 30);
                prompt_message_jPanel.add(jText13);
                int ioCodeBit13 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit13();
                jText13.setText(ioCodeBit13 + "");

                JTextField jText14 = new JTextField();
                jText14.setBounds(410, 710, 230, 30);
                prompt_message_jPanel.add(jText14);
                int ioCodeBit14 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit14();
                jText14.setText(ioCodeBit14 + "");

                JTextField jText15 = new JTextField();
                jText15.setBounds(410, 760, 230, 30);
                prompt_message_jPanel.add(jText15);
                int ioCodeBit15 = middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().getIoCodeBit15();
                jText15.setText(ioCodeBit15 + "");

                JButton jButton = new JButton("确定");
                jButton.setBounds(480, 810, 160, 30);
                prompt_message_jPanel.add(jButton);
                jButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        String jtext0 = jText0.getText();
                        String jtext01 = jText01.getText();
                        String jtext02 = jText02.getText();
                        String jtext03 = jText03.getText();
                        String jtext04 = jText04.getText();
                        String jtext05 = jText05.getText();
                        String jtext06 = jText06.getText();
                        String jtext07 = jText07.getText();
                        String jtext08 = jText08.getText();
                        String jtext09 = jText09.getText();
                        String jtext10 = jText10.getText();
                        String jtext11 = jText11.getText();
                        String jtext12 = jText12.getText();
                        String jtext13 = jText13.getText();
                        String jtext14 = jText14.getText();
                        String jtext15 = jText15.getText();
                        motorControlCommand_posi_jTextField1_22.setText(jtext0 + jtext01 + jtext02 + jtext03 + jtext04 + jtext05 + jtext06 + jtext07 + jtext08 + jtext09 + jtext10 + jtext11 + jtext12 + jtext13 + jtext14 + jtext15);
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit0(Integer.parseInt(jtext0));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit1(Integer.parseInt(jtext01));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit2(Integer.parseInt(jtext02));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit3(Integer.parseInt(jtext03));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit4(Integer.parseInt(jtext04));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit5(Integer.parseInt(jtext05));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit6(Integer.parseInt(jtext06));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit7(Integer.parseInt(jtext07));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit8(Integer.parseInt(jtext08));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit9(Integer.parseInt(jtext09));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit10(Integer.parseInt(jtext10));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit11(Integer.parseInt(jtext11));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit12(Integer.parseInt(jtext12));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit13(Integer.parseInt(jtext13));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit14(Integer.parseInt(jtext14));
                        middlewareUtilTwoDemo.statusResponseTwo.getControlDataTwoCupModel().setIoCodeBit15(Integer.parseInt(jtext15));
                        jFrame.setVisible(false);
                        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }
                });

                jFrame.add(jScrollPane);
                jFrame.setVisible(true);
                jFrame.setBounds(200, 200, 860, 760);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        //电机复位
        em_reset_jtext = new JTextField();
        em_reset_jtext.setPreferredSize(new Dimension(240, 30));
        em_reset_jtext.setFont(font);

        // 抓管动作序号
        motorControlCommand_posi_jTextField1_2 = new JTextField();
        motorControlCommand_posi_jTextField1_2.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_2.setFont(font);

        //抓管源位置
        motorControlCommand_posi_jTextField1_3 = new JTextField();
        motorControlCommand_posi_jTextField1_3.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_3.setFont(font);

        //抓管目标位置
        motorControlCommand_posi_jTextField1_4 = new JTextField();
        motorControlCommand_posi_jTextField1_4.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_4.setFont(font);

        //抓管动作完成后夹爪停靠位置
        motorControlCommand_posi_jTextField1_5 = new JTextField();
        motorControlCommand_posi_jTextField1_5.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_5.setFont(font);

        //移液动作序号
        motorControlCommand_posi_jTextField1_6 = new JTextField();
        motorControlCommand_posi_jTextField1_6.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_6.setFont(font);

        //移液目标板位位置
        motorControlCommand_posi_jTextField1_7 = new JTextField();
        motorControlCommand_posi_jTextField1_7.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_7.setFont(font);
        //移液动作
        motorControlCommand_posi_jTextField1_8 = new JTextField();
        motorControlCommand_posi_jTextField1_8.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_8.setFont(font);
        //多洗多排序号
        motorControlCommand_posi_jTextField1_9 = new JTextField();
        motorControlCommand_posi_jTextField1_9.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_9.setFont(font);
        //液位探测
        motorControlCommand_posi_jTextField1_10 = new JTextField();
        motorControlCommand_posi_jTextField1_10.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_10.setFont(font);
        //移液量
        motorControlCommand_posi_jTextField1_11 = new JTextField();
        motorControlCommand_posi_jTextField1_11.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_11.setFont(font);

        //搬运动作序号
        motorControlCommand_posi_jTextField1_12 = new JTextField();
        motorControlCommand_posi_jTextField1_12.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_12.setFont(font);

        //搬运目标位置
        motorControlCommand_posi_jTextField1_13 = new JTextField();
        motorControlCommand_posi_jTextField1_13.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_13.setFont(font);

        //搬运动作完成后停靠位置
        motorControlCommand_posi_jTextField1_14 = new JTextField();
        motorControlCommand_posi_jTextField1_14.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_14.setFont(font);

        //旋盖动作序号
        motorControlCommand_posi_jTextField1_15 = new JTextField();
        motorControlCommand_posi_jTextField1_15.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_15.setFont(font);

        //旋盖动作
        motorControlCommand_posi_jTextField1_16 = new JTextField();
        motorControlCommand_posi_jTextField1_16.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_16.setFont(font);
        //扫码开启
        motorControlCommand_posi_jTextField1_17 = new JTextField();
        motorControlCommand_posi_jTextField1_17.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_17.setFont(font);
        //抓管三轴定位序号
        motorControlCommand_posi_jTextField1_18 = new JTextField();
        motorControlCommand_posi_jTextField1_18.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_18.setFont(font);

        //抓管三轴定位位置
        motorControlCommand_posi_jTextField1_19 = new JTextField();
        motorControlCommand_posi_jTextField1_19.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_19.setFont(font);

        //移液三轴定位序号
        motorControlCommand_posi_jTextField1_20 = new JTextField();
        motorControlCommand_posi_jTextField1_20.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_20.setFont(font);

        //移液三轴定位位置
        motorControlCommand_posi_jTextField1_21 = new JTextField();
        motorControlCommand_posi_jTextField1_21.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_21.setFont(font);
        //IO控制
        motorControlCommand_posi_jTextField1_22 = new JTextField();
        motorControlCommand_posi_jTextField1_22.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_22.setFont(font);

        //IO控制
        motorControlCommand_posi_jTextField1_23 = new JTextField();
        motorControlCommand_posi_jTextField1_23.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_23.setFont(font);

        //IO控制
        motorControlCommand_posi_jTextField1_24 = new JTextField();
        motorControlCommand_posi_jTextField1_24.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_24.setFont(font);

        //IO控制
        motorControlCommand_posi_jTextField1_25 = new JTextField();
        motorControlCommand_posi_jTextField1_25.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_25.setFont(font);
        //IO控制
        motorControlCommand_posi_jTextField1_26 = new JTextField();
        motorControlCommand_posi_jTextField1_26.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_26.setFont(font);
        //IO控制
        motorControlCommand_posi_jTextField1_27 = new JTextField();
        motorControlCommand_posi_jTextField1_27.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_27.setFont(font);

        motorControlCommand_posi_jTextField1_28 = new JTextField();
        motorControlCommand_posi_jTextField1_28.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_28.setFont(font);

        //IO控制
        motorControlCommand_posi_jTextField1_271 = new JTextField();
        motorControlCommand_posi_jTextField1_271.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_271.setFont(font);

        motorControlCommand_posi_jTextField1_272 = new JTextField();
        motorControlCommand_posi_jTextField1_272.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_272.setFont(font);

        JPanel statusQueryCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_second_jPanel = new JPanel(new BorderLayout());
        JPanel statusQueryCommand_third_jPanel = new JPanel(new BorderLayout());

        JButton statusQueryCommand_jButton = new JButton("状态查询命令");
        statusQueryCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.statusRequestINIT();
            }
        });
        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        statusQueryCommand_first_jPanel.add(myuseless_first_jPanel);
        statusQueryCommand_first_jPanel.setPreferredSize(new Dimension(850, 28));
        statusQueryCommand_jPanel.add(statusQueryCommand_first_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(5, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 10));
        myuseless_third_jPanel.add(statusQueryCommand_jButton);//状态查询
        myuseless_third_jPanel.add(sendCommand_jButton);//发送控制命令

        statusQueryCommand_jButton.setPreferredSize(new Dimension(220, 30));
        sendCommand_jButton.setPreferredSize(new Dimension(220, 30));
        myuseless_third_jPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(5, 30));
        statusQueryCommand_second_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_second_jPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        statusQueryCommand_second_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_second_jPanel.setPreferredSize(new Dimension(454, 50));
        send.add(statusQueryCommand_second_jPanel);

        jList_statusres = new JList<>(new String[]{""});
        JScrollPane jScrollPane = new JScrollPane(jList_statusres);
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(10, 10));
        jScrollPane.setPreferredSize(new Dimension(940, 640));
        statusQueryCommand_third_jPanel.add(jScrollPane, BorderLayout.CENTER);

        em = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        em.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        em.setPreferredSize(new Dimension(average_width, 48));
        em_emJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        em_sencodJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        em_emJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        em_sencodJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        em_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        em_useJpanel.setPreferredSize(new Dimension(10, 46));
        em_emJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        em_emJpanel.add(em_reset);
        em_emJpanel.add(em_useJpanel);
        em_sencodJpanel.add(em_reset_jtext);
        em.add(em_emJpanel);
        em.add(em_sencodJpanel);
        //motorControlCommand_secondjPanel.add(first);
        send.add(em);

        //参数查询1
        first = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        first.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        first.setPreferredSize(new Dimension(average_width, 48));
        first_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        first_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        first_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        first_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        first_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        first_firstJPanel.add(motorControlCommand_num_jLabel_2);
        first_firstJPanel.add(useless_third_jPanel);
        first_secondJPanel.add(motorControlCommand_posi_jTextField1_2);
        first.add(first_firstJPanel);
        first.add(first_secondJPanel);
        //motorControlCommand_secondjPanel.add(first);
        send.add(first);

        //参数查询2 （two,two_twoJpanel,two_sencodJpanel,two_useJpanel）;
        two = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        two.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        two.setPreferredSize(new Dimension(average_width, 48));
        two_twoJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        two_sencodJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        two_twoJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        two_sencodJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        two_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        two_useJpanel.setPreferredSize(new Dimension(10, 46));
        two_twoJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        two_twoJpanel.add(motorControlCommand_num_jLabel_3);
        two_twoJpanel.add(two_useJpanel);
        two_sencodJpanel.add(motorControlCommand_posi_jTextField1_3);
        two.add(two_twoJpanel);
        two.add(two_sencodJpanel);
        send.add(two);

        //参数查询3 three,three_threeJpanel,three_sencondJpanel,three_useJpanel;
        three = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        three.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        three.setPreferredSize(new Dimension(average_width, 48));
        three_threeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        three_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        three_threeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        three_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        three_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        three_useJpanel.setPreferredSize(new Dimension(10, 46));
        three_threeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        three_threeJpanel.add(motorControlCommand_num_jLabel_4);
        three_threeJpanel.add(three_useJpanel);
        three_sencondJpanel.add(motorControlCommand_posi_jTextField1_4);
        three.add(three_threeJpanel);
        three.add(three_sencondJpanel);
        send.add(three);

        //参数查询4 four,four_fourJpanel,four_sencondJpanel,four_useJpanel;
        four = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        four.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        four.setPreferredSize(new Dimension(average_width, 48));
        four_fourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        four_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        four_fourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        four_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        four_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        four_useJpanel.setPreferredSize(new Dimension(10, 46));
        four_fourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        four_fourJpanel.add(motorControlCommand_num_jLabel_5);
        four_fourJpanel.add(four_useJpanel);
        four_sencondJpanel.add(motorControlCommand_posi_jTextField1_5);
        four.add(four_fourJpanel);
        four.add(four_sencondJpanel);
        send.add(four);

        //参数查询5 five,five_threeJpanel,five_sencondJpanel,five_useJpanel;
        five = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        five.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        five.setPreferredSize(new Dimension(average_width, 48));
        five_threeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        five_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        five_threeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        five_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        five_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        five_useJpanel.setPreferredSize(new Dimension(10, 46));
        five_threeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        five_threeJpanel.add(motorControlCommand_num_jLabel_6);
        five_threeJpanel.add(five_useJpanel);
        five_sencondJpanel.add(motorControlCommand_posi_jTextField1_6);
        five.add(five_threeJpanel);
        five.add(five_sencondJpanel);
        send.add(five);

        //参数查询6 six,six_threeJpanel,six_sencondJpanel,six_useJpanel;
        six = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        six.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        six.setPreferredSize(new Dimension(average_width, 48));
        six_threeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        six_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        six_threeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        six_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        six_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        six_useJpanel.setPreferredSize(new Dimension(10, 46));
        six_threeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        six_threeJpanel.add(motorControlCommand_num_jLabel_7);
        six_threeJpanel.add(six_useJpanel);
        six_sencondJpanel.add(motorControlCommand_posi_jTextField1_7);
        six.add(six_threeJpanel);
        six.add(six_sencondJpanel);
        send.add(six);

        twentyfour_five_one = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_five_one.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentyfour_five_one.setPreferredSize(new Dimension(average_width, 48));
        twentyfour_five_one_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentyfour_five_one_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentyfour_five_one_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentyfour_five_one_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentyfour_five_one_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_five_one_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentyfour_five_one_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentyfour_five_one_twentyfourJpanel.add(motorControlCommand_num_jLabel_271);
        twentyfour_five_one_twentyfourJpanel.add(twentyfour_five_one_useJpanel);
        twentyfour_five_one_sencondJpanel.add(motorControlCommand_posi_jTextField1_271);
        twentyfour_five_one.add(twentyfour_five_one_twentyfourJpanel);
        twentyfour_five_one.add(twentyfour_five_one_sencondJpanel);
        send.add(twentyfour_five_one);

        //参数查询8 eight,eight_eightJpanel,eight_sencondJpanel,eight_useJpanel;
        eight = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eight.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        eight.setPreferredSize(new Dimension(average_width, 48));
        eight_eightJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        eight_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        eight_eightJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        eight_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        eight_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eight_useJpanel.setPreferredSize(new Dimension(10, 46));
        eight_eightJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        eight_eightJpanel.add(motorControlCommand_num_jLabel_8);
        eight_eightJpanel.add(eight_useJpanel);
        eight_sencondJpanel.add(motorControlCommand_posi_jTextField1_8);
        eight.add(eight_eightJpanel);
        eight.add(eight_sencondJpanel);
        send.add(eight);

        twenty = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twenty.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twenty.setPreferredSize(new Dimension(average_width, 48));
        twenty_twentyJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twenty_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twenty_twentyJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twenty_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twenty_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twenty_useJpanel.setPreferredSize(new Dimension(10, 46));
        twenty_twentyJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twenty_twentyJpanel.add(motorControlCommand_num_jLabel_9);
        twenty_twentyJpanel.add(twenty_useJpanel);
        twenty_sencondJpanel.add(motorControlCommand_posi_jTextField1_9);
        twenty.add(twenty_twentyJpanel);
        twenty.add(twenty_sencondJpanel);
        send.add(twenty);

        //twentyone,twentyone_twentyoneJpanel,twentyone_sencondJpanel,twentyone_useJpanel;
        twentyone = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentyone.setPreferredSize(new Dimension(average_width, 48));
        twentyone_twentyoneJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentyone_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentyone_twentyoneJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentyone_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentyone_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyone_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentyone_twentyoneJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentyone_twentyoneJpanel.add(motorControlCommand_num_jLabel_10);
        twentyone_twentyoneJpanel.add(twentyone_useJpanel);
        twentyone_sencondJpanel.add(motorControlCommand_posi_jTextField1_10);
        twentyone.add(twentyone_twentyoneJpanel);
        twentyone.add(twentyone_sencondJpanel);
        send.add(twentyone);

        //参数查询9 nine,nine_nineJpanel,nine_sencondJpanel,nine_useJpanel;
        nine = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        nine.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nine.setPreferredSize(new Dimension(average_width, 48));
        nine_nineJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        nine_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        nine_nineJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        nine_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        nine_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        nine_useJpanel.setPreferredSize(new Dimension(10, 46));
        nine_nineJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        nine_nineJpanel.add(motorControlCommand_num_jLabel_11);
        nine_nineJpanel.add(nine_useJpanel);
        nine_sencondJpanel.add(motorControlCommand_posi_jTextField1_11);
        nine.add(nine_nineJpanel);
        nine.add(nine_sencondJpanel);
        send.add(nine);

        //ten,ten_tenJpanel,ten_sencondJpanel,ten_useJpanel;
        ten = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        ten.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ten.setPreferredSize(new Dimension(average_width, 48));
        ten_tenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        ten_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        ten_tenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        ten_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        ten_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        ten_useJpanel.setPreferredSize(new Dimension(10, 46));
        ten_tenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        ten_tenJpanel.add(motorControlCommand_num_jLabel_12);
        ten_tenJpanel.add(ten_useJpanel);
        ten_sencondJpanel.add(motorControlCommand_posi_jTextField1_12);
        ten.add(ten_tenJpanel);
        ten.add(ten_sencondJpanel);
        send.add(ten);

        //eleven,eleven_elevenJpanel,eleven_sencondJpanel,eleven_useJpanel;
        eleven = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eleven.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        eleven.setPreferredSize(new Dimension(average_width, 48));
        eleven_elevenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        eleven_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        eleven_elevenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        eleven_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        eleven_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eleven_useJpanel.setPreferredSize(new Dimension(10, 46));
        eleven_elevenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        eleven_elevenJpanel.add(motorControlCommand_num_jLabel_13);
        eleven_elevenJpanel.add(eleven_useJpanel);
        eleven_sencondJpanel.add(motorControlCommand_posi_jTextField1_13);
        eleven.add(eleven_elevenJpanel);
        eleven.add(eleven_sencondJpanel);
        send.add(eleven);

        //twelve,twelve_twelveJpanel,twelve_sencondJpanel,twelve_useJpanel;
        twelve = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twelve.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twelve.setPreferredSize(new Dimension(average_width, 48));
        twelve_twelveJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twelve_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twelve_twelveJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twelve_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twelve_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twelve_useJpanel.setPreferredSize(new Dimension(10, 46));
        twelve_twelveJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twelve_twelveJpanel.add(motorControlCommand_num_jLabel_14);
        twelve_twelveJpanel.add(twelve_useJpanel);
        twelve_sencondJpanel.add(motorControlCommand_posi_jTextField1_14);
        twelve.add(twelve_twelveJpanel);
        twelve.add(twelve_sencondJpanel);
        send.add(twelve);

        //thirteen,thirteen_thirteenJpanel,thirteen_sencondJpanel,thirteen_useJpanel;
        thirteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        thirteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        thirteen.setPreferredSize(new Dimension(average_width, 48));
        thirteen_thirteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        thirteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        thirteen_thirteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        thirteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        thirteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        thirteen_useJpanel.setPreferredSize(new Dimension(10, 46));
        thirteen_thirteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        thirteen_thirteenJpanel.add(motorControlCommand_num_jLabel_15);
        thirteen_thirteenJpanel.add(thirteen_useJpanel);
        thirteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_15);
        thirteen.add(thirteen_thirteenJpanel);
        thirteen.add(thirteen_sencondJpanel);
        send.add(thirteen);

        //fourteen,fourteen_fourteenJpanel,fourteen_sencondJpanel,fourteen_useJpanel;
        fourteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fourteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fourteen.setPreferredSize(new Dimension(average_width, 48));
        fourteen_fourteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        fourteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        fourteen_fourteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        fourteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        fourteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fourteen_useJpanel.setPreferredSize(new Dimension(10, 46));
        fourteen_fourteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        fourteen_fourteenJpanel.add(motorControlCommand_num_jLabel_16);
        fourteen_fourteenJpanel.add(fourteen_useJpanel);
        fourteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_16);
        fourteen.add(fourteen_fourteenJpanel);
        fourteen.add(fourteen_sencondJpanel);
        send.add(fourteen);

        fourteenone = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fourteenone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fourteenone.setPreferredSize(new Dimension(average_width, 48));
        fourteenone_fourteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        fourteenone_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        fourteenone_fourteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        fourteenone_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        fourteenone_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fourteenone_useJpanel.setPreferredSize(new Dimension(10, 46));
        fourteenone_fourteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        fourteenone_fourteenJpanel.add(motorControlCommand_num_jLabel_17);
        fourteenone_fourteenJpanel.add(fourteenone_useJpanel);
        fourteenone_sencondJpanel.add(motorControlCommand_posi_jTextField1_17);
        fourteenone.add(fourteenone_fourteenJpanel);
        fourteenone.add(fourteenone_sencondJpanel);
        send.add(fourteenone);

        //fifteen,fifteen_fifteenJpanel,fifteen_sencondJpanel,fifteen_useJpanel;
        fifteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fifteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fifteen.setPreferredSize(new Dimension(average_width, 48));
        fifteen_fifteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        fifteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        fifteen_fifteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        fifteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        fifteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fifteen_useJpanel.setPreferredSize(new Dimension(10, 46));
        fifteen_fifteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        fifteen_fifteenJpanel.add(motorControlCommand_num_jLabel_18);
        fifteen_fifteenJpanel.add(fifteen_useJpanel);
        fifteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_18);
        fifteen.add(fifteen_fifteenJpanel);
        fifteen.add(fifteen_sencondJpanel);
        send.add(fifteen);

        //sixteen,sixteen_sixteenJpanel,sixteen_sencondJpanel,sixteen_useJpanel;
        sixteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        sixteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sixteen.setPreferredSize(new Dimension(average_width, 48));
        sixteen_sixteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        sixteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        sixteen_sixteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        sixteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        sixteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        sixteen_useJpanel.setPreferredSize(new Dimension(10, 46));
        sixteen_sixteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        sixteen_sixteenJpanel.add(motorControlCommand_num_jLabel_19);
        sixteen_sixteenJpanel.add(sixteen_useJpanel);
        sixteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_19);
        sixteen.add(sixteen_sixteenJpanel);
        sixteen.add(sixteen_sencondJpanel);
        send.add(sixteen);

        //seventeen,seventeen_seventeenJpanel,seventeen_sencondJpanel,seventeen_useJpanel;
        seventeen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        seventeen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        seventeen.setPreferredSize(new Dimension(average_width, 48));
        seventeen_seventeenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        seventeen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        seventeen_seventeenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        seventeen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        seventeen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        seventeen_useJpanel.setPreferredSize(new Dimension(10, 46));
        seventeen_seventeenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        seventeen_seventeenJpanel.add(motorControlCommand_num_jLabel_20);
        seventeen_seventeenJpanel.add(seventeen_useJpanel);
        seventeen_sencondJpanel.add(motorControlCommand_posi_jTextField1_20);
        seventeen.add(seventeen_seventeenJpanel);
        seventeen.add(seventeen_sencondJpanel);
        send.add(seventeen);

        //eighteen,eighteen_eighteenJpanel,eighteen_sencondJpanel,eighteen_useJpanel;
        eighteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eighteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        eighteen.setPreferredSize(new Dimension(average_width, 48));
        eighteen_eighteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        eighteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        eighteen_eighteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        eighteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        eighteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eighteen_useJpanel.setPreferredSize(new Dimension(10, 46));
        eighteen_eighteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        eighteen_eighteenJpanel.add(motorControlCommand_num_jLabel_21);
        eighteen_eighteenJpanel.add(eighteen_useJpanel);
        eighteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_21);
        eighteen.add(eighteen_eighteenJpanel);
        eighteen.add(eighteen_sencondJpanel);
        send.add(eighteen);

        twentytwo = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentytwo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentytwo.setPreferredSize(new Dimension(average_width, 48));
        twentytwo_twentytwoJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentytwo_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentytwo_twentytwoJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentytwo_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentytwo_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentytwo_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentytwo_twentytwoJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentytwo_twentytwoJpanel.add(motorControlCommand_num_jLabel_22);
        twentytwo_twentytwoJpanel.add(twentytwo_useJpanel);
        twentytwo_sencondJpanel.add(motorControlCommand_posi_jTextField1_22);
        twentytwo.add(twentytwo_twentytwoJpanel);
        twentytwo.add(twentytwo_sencondJpanel);
        send.add(twentytwo);

        twentythree = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentythree.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentythree.setPreferredSize(new Dimension(average_width, 48));
        twentythree_twentythreeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentythree_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentythree_twentythreeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentythree_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentythree_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentythree_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentythree_twentythreeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentythree_twentythreeJpanel.add(motorControlCommand_num_jLabel_23);
        twentythree_twentythreeJpanel.add(twentythree_useJpanel);
        twentythree_sencondJpanel.add(motorControlCommand_posi_jTextField1_23);
        twentythree.add(twentythree_twentythreeJpanel);
        twentythree.add(twentythree_sencondJpanel);
        send.add(twentythree);

        twentyfour = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentyfour.setPreferredSize(new Dimension(average_width, 48));
        twentyfour_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentyfour_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentyfour_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentyfour_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentyfour_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentyfour_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentyfour_twentyfourJpanel.add(motorControlCommand_num_jLabel_24);
        twentyfour_twentyfourJpanel.add(twentyfour_useJpanel);
        twentyfour_sencondJpanel.add(motorControlCommand_posi_jTextField1_24);
        twentyfour.add(twentyfour_twentyfourJpanel);
        twentyfour.add(twentyfour_sencondJpanel);
        send.add(twentyfour);

        twentyfour_six = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_six.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentyfour_six.setPreferredSize(new Dimension(average_width, 48));
        twentyfour_six_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentyfour_six_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentyfour_six_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentyfour_six_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentyfour_six_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_six_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentyfour_six_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentyfour_six_twentyfourJpanel.add(motorControlCommand_num_jLabel_28);
        twentyfour_six_twentyfourJpanel.add(twentyfour_six_useJpanel);
        twentyfour_six_sencondJpanel.add(motorControlCommand_posi_jTextField1_28);
        twentyfour_six.add(twentyfour_six_twentyfourJpanel);
        twentyfour_six.add(twentyfour_six_sencondJpanel);
        send.add(twentyfour_six);

        twentyfour_one = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_one.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentyfour_one.setPreferredSize(new Dimension(average_width, 48));
        twentyfour_one_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentyfour_one_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentyfour_one_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentyfour_one_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentyfour_one_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_one_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentyfour_one_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentyfour_one_twentyfourJpanel.add(motorControlCommand_num_jLabel_25);
        twentyfour_one_twentyfourJpanel.add(twentyfour_one_useJpanel);
        twentyfour_one_sencondJpanel.add(motorControlCommand_posi_jTextField1_25);
        twentyfour_one.add(twentyfour_one_twentyfourJpanel);
        twentyfour_one.add(twentyfour_one_sencondJpanel);
        send.add(twentyfour_one);

//        twentyfour_two = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour_two.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twentyfour_two.setPreferredSize(new Dimension(average_width, 48));
//        twentyfour_two_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twentyfour_two_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twentyfour_two_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twentyfour_two_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twentyfour_two_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour_two_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twentyfour_two_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twentyfour_two_twentyfourJpanel.add(motorControlCommand_num_jLabel_24);
//        twentyfour_two_twentyfourJpanel.add(twentyfour_two_useJpanel);
//        twentyfour_two_sencondJpanel.add(motorControlCommand_posi_jTextField1_24);
//        twentyfour_two.add(twentyfour_two_twentyfourJpanel);
//        twentyfour_two.add(twentyfour_two_sencondJpanel);
//        send.add(twentyfour_two);
//
//        twentyfour_three = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour_three.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twentyfour_three.setPreferredSize(new Dimension(average_width, 48));
//        twentyfour_three_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twentyfour_three_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twentyfour_three_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twentyfour_three_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twentyfour_three_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour_three_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twentyfour_three_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twentyfour_three_twentyfourJpanel.add(motorControlCommand_num_jLabel_25);
//        twentyfour_three_twentyfourJpanel.add(twentyfour_three_useJpanel);
//        twentyfour_three_sencondJpanel.add(motorControlCommand_posi_jTextField1_25);
//        twentyfour_three.add(twentyfour_three_twentyfourJpanel);
//        twentyfour_three.add(twentyfour_three_sencondJpanel);
//        send.add(twentyfour_three);

        twentyfour_four = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_four.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentyfour_four.setPreferredSize(new Dimension(average_width, 48));
        twentyfour_four_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentyfour_four_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentyfour_four_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentyfour_four_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentyfour_four_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_four_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentyfour_four_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentyfour_four_twentyfourJpanel.add(motorControlCommand_num_jLabel_26);
        twentyfour_four_twentyfourJpanel.add(twentyfour_four_useJpanel);
        twentyfour_four_sencondJpanel.add(motorControlCommand_posi_jTextField1_26);
        twentyfour_four.add(twentyfour_four_twentyfourJpanel);
        twentyfour_four.add(twentyfour_four_sencondJpanel);
        send.add(twentyfour_four);

        twentyfour_five = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_five.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        twentyfour_five.setPreferredSize(new Dimension(average_width, 48));
        twentyfour_five_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentyfour_five_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentyfour_five_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentyfour_five_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentyfour_five_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentyfour_five_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentyfour_five_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentyfour_five_twentyfourJpanel.add(motorControlCommand_num_jLabel_27);
        twentyfour_five_twentyfourJpanel.add(twentyfour_five_useJpanel);
        twentyfour_five_sencondJpanel.add(motorControlCommand_posi_jTextField1_27);
        twentyfour_five.add(twentyfour_five_twentyfourJpanel);
        twentyfour_five.add(twentyfour_five_sencondJpanel);
        send.add(twentyfour_five);

//        twentyfour_five_two = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour_five_two.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twentyfour_five_two.setPreferredSize(new Dimension(average_width, 48));
//        twentyfour_five_two_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twentyfour_five_two_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twentyfour_five_two_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twentyfour_five_two_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twentyfour_five_two_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour_five_two_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twentyfour_five_two_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twentyfour_five_two_twentyfourJpanel.add(motorControlCommand_num_jLabel_272);
//        twentyfour_five_two_twentyfourJpanel.add(twentyfour_five_two_useJpanel);
//        twentyfour_five_two_sencondJpanel.add(motorControlCommand_posi_jTextField1_272);
//        twentyfour_five_two.add(twentyfour_five_two_twentyfourJpanel);
//        twentyfour_five_two.add(twentyfour_five_two_sencondJpanel);
//        send.add(twentyfour_five_two);

        statusQueryCommand_jPanel.setPreferredSize(new Dimension(850, 80));
        myuseless_fifth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fifth_jPanel.setPreferredSize(new Dimension(80, 30));

        myuseless_seventh_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_seventh_jPanel.setPreferredSize(new Dimension(121, 30));
        return mainPanel;
    }

    /**
     * 创建一个面板,用于显示线选项卡 '标定状态查询命令' 需要显示的内容
     *
     * @return
     */
    public JComponent biaodingStatusQueryCommand() {
        // 创建面板
        JPanel mainPanel = new JPanel();
        // --------------------------------状态查询命令------------------------------//
        JPanel statusQueryCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_second_jPanel = new JPanel(new BorderLayout());
        JPanel statusQueryCommand_third_jPanel = new JPanel(new BorderLayout());


        JLabel statusQueryCommand_jLabel = new JLabel("标定查询命令测试");
        statusQueryCommand_jLabel.setForeground(Color.red);

        JButton statusQueryCommand_jButton = new JButton("标定状态查询");

        JLabel gripperControlCommand_num_jLabel = new JLabel("定位位置编号");
        gripperControlCommand_num_jLabel.setFont(font);

        JTextField gripperControlCommand_num_jTextField = new JTextField();
        gripperControlCommand_num_jTextField.setPreferredSize(new Dimension(245, 30));
        gripperControlCommand_num_jTextField.setFont(font);

        String[] motorControlCommand_num = null;
        motorControlCommand_num = new String[]{
                "1.托盘张开位置", "2.管架抬升到位", "3.抓管左上点", "4.抓管右上点", "5.抓管左下点", "6.试管右下点", "7.夹爪释放位置", "8.空爪安全位置",
                "9.带管安全位置", "10.扫码位置", "11.开盖位置", "12.取大tip头右上点", "13.取大tip头左上点", "14.取大tip头右下点", "15.取大tip头左下点", "16.深孔板右上点",
                "17.深孔板左上点", "18.深孔板右下点", "19.深孔板左下点", "20.吸液位置", "21.tip头丢弃位上", "22.tip头丢弃位中", "23.tip头丢弃位下",
                //"24.深孔板上方位置1", "25.深孔板上方位置2", "26.深孔板上方位置3", "27.深孔板上方位置4",
                "-----------","-----------","-----------","-----------",
                "28.仓库复位位置",
                //"29.仓库挡板可运动位置",
                "30.料架可旋转位置", "31.料架上抬位置",
                "32.仓库1号位取准备", "33.仓库1号位取", "34.仓库1号位放", "35.仓库1号位放准备", "36.仓库2号位取准备", "37.仓库2号位取", "38.仓库2号位放", "39.仓库2号位放准备",
                "40.仓库3号位取准备", "41.仓库3号位取", "42.仓库3号位放", "43.仓库3号位放准备", "44.仓库4号位取准备", "45.仓库4号位取", "46.仓库4号位放", "47.仓库4号位放准备",
                "48.仓库5号位取准备", "49.仓库5号位取", "50.仓库5号位放", "51.仓库5号位放准备", "52.仓库6号位取准备", "53.仓库6号位取", "54.仓库6号位放", "55.仓库6号位放准备",
                //"56.机械臂位置1", "57.机械臂位置2", "58.机械臂位置3", "59.机械臂位置4",
                "-----------","-----------","-----------","-----------",
                "60.取管最大位置" , "61.二次扫码位置" ,
                "-----------",
                //"62.试管在夹爪内调整位置 " ,
                "63.蛋白酶吸液位置 " , "64.蛋白酶吸液最低位置",
                //"65.单采吸液位置" , "66.单采吸液下限位置", "67.混采吸液位置", "68.混采吸液下限位置",
                "-----------","-----------","-----------","-----------"
                ,"65.采液位置"
                , "69.候补tip头右顶点位置","70.候补tip头左顶点位置","71.候补tip头右底点位置","72.候补tip头左底点位置"
        };

        JComboBox motorControlCommand_num_comboBox = new JComboBox<String>(motorControlCommand_num);
        motorControlCommand_num_comboBox.setPreferredSize(new Dimension(250, 30));
        motorControlCommand_num_comboBox.setFont(font);


        statusQueryCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int motorControlCommand_num_selectedIndex = motorControlCommand_num_comboBox.getSelectedIndex();
                String gripperControlCommand_num_text = String.valueOf(motorControlCommand_num_selectedIndex + 1);
                if (gripperControlCommand_num_text == null || "".equals(gripperControlCommand_num_text)) {
                    JOptionPane.showMessageDialog(null, "定位位置编号参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                System.out.println("标定位置查询参数:" + gripperControlCommand_num_text);
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.stationQueryControl(Integer.parseInt(gripperControlCommand_num_text));
                logger.info("发送标定状态查询命令！");
            }
        });
        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        statusQueryCommand_first_jPanel.add(myuseless_first_jPanel);
        statusQueryCommand_first_jPanel.add(statusQueryCommand_jLabel);
        statusQueryCommand_first_jPanel.setPreferredSize(new Dimension(1460, 28));

        second_zero = new JPanel();
        second_zero.setPreferredSize(new Dimension(80, 48));
        statusQueryCommand_fourth_jPanel.add(second_zero);


        statusQueryCommand_jPanel.add(statusQueryCommand_first_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        myuseless_third_jPanel.add(statusQueryCommand_jButton);
        statusQueryCommand_jButton.setPreferredSize(new Dimension(160, 30));
        myuseless_third_jPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(120, 30));
        statusQueryCommand_second_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_second_jPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        statusQueryCommand_second_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_second_jPanel.setPreferredSize(new Dimension(1460, 50));
        statusQueryCommand_jPanel.add(statusQueryCommand_second_jPanel);

        /**
         * 增加一行  6列 开始
         */

        fourth = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fourth.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black));
        fourth.setPreferredSize(new Dimension(average_width, 48));
        fourth_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        fourth_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        fourth_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        fourth_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        fourth_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        fourth_firstJPanel.add(gripperControlCommand_num_jLabel);
        fourth_firstJPanel.add(useless_third_jPanel);
        fourth_secondJPanel.add(motorControlCommand_num_comboBox);
        fourth.add(fourth_firstJPanel);
        fourth.add(fourth_secondJPanel);
        statusQueryCommand_fourth_jPanel.add(fourth);

        fifth = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fifth.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.black));
        fifth.setPreferredSize(new Dimension(average_width, 48));
        fifth_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        fifth_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        fifth_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        fifth_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        fifth_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        fifth_firstJPanel.add(useless_third_jPanel);
        fifth.add(fifth_firstJPanel);
        fifth.add(fifth_secondJPanel);
        statusQueryCommand_fourth_jPanel.add(fifth);

        sixth = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        sixth.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.black));
        sixth.setPreferredSize(new Dimension(average_width - 1, 48));
        sixth_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        sixth_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        sixth_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        sixth_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        sixth_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        sixth.add(sixth_firstJPanel);
        sixth.add(sixth_secondJPanel);
        statusQueryCommand_fourth_jPanel.add(sixth);

        statusQueryCommand_fourth_jPanel.setPreferredSize(new Dimension(1460, 48));
        statusQueryCommand_jPanel.add(statusQueryCommand_fourth_jPanel);

        /**
         * 增加一行  6列 结束
         */


        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));

        // String[] testString =  new String[]{"标定位置序号：1","标定位置X轴坐标：0","标定位置Y轴坐标：-30000","标定位置Z轴坐标：1002"};

        jList_statusresBiaoding = new JList<>(new String[]{""});
        JScrollPane jScrollPane = new JScrollPane(jList_statusresBiaoding);

        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(120, 30));
        statusQueryCommand_third_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_third_jPanel.add(jScrollPane, BorderLayout.CENTER);
        statusQueryCommand_third_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_third_jPanel.setPreferredSize(new Dimension(1460, 600));
        jScrollPane.setPreferredSize(new Dimension(1460, 590));

        statusQueryCommand_third_jPanel.setBackground(Color.RED);
        statusQueryCommand_jPanel.setPreferredSize(new Dimension(1460, 700));
        statusQueryCommand_jPanel.add(statusQueryCommand_third_jPanel);
        mainPanel.add(statusQueryCommand_jPanel);
        return mainPanel;
    }


    /**
     * 创建一个面板,用于显示线选项卡  '夹爪控制命令' 需要显示的内容
     *
     * @return
     */
    public JComponent gripperControlCommand() {
        JPanel mainPanel = new JPanel();
        //--------------------------------夹爪控制命令------------------------------//
        JPanel gripperControlCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel gripperControlCommand_first_jPanel = new JPanel(new BorderLayout());
        JPanel gripperControlCommand_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel gripperControlCommand_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel gripperControlCommand_fourth_jPanel = new JPanel(new BorderLayout());
        // JButton motorControlCommand_jButton2 = new JButton("移动到标定位置");
        JButton gripperControlCommand_jButton = new JButton("标定设置命令");
        JButton adpParamControlCommand_jButton = new JButton("移液枪参数设置");
        //JButton motorControlCommand_jButton = new JButton("电机控制命令");
        // JButton motorControlCommand_jButton22 = new JButton("Z轴位置自动标定命令");

        JLabel gripperControlCommand_jLabel = new JLabel("标定位置设置命令测试");
        gripperControlCommand_jLabel.setForeground(Color.red);

        double value = new Integer(0);
        double min = new Integer(-1000);
        double max = new Integer(1000);
        double step = new Double(0.1);
        JSpinner jT1 = new JSpinner(new SpinnerNumberModel(value, min, max, step));

        JLabel gripperControlCommand_num_jLabel = new JLabel("定位位置编号");
        gripperControlCommand_num_jLabel.setFont(font);
        String[] motorControlCommand_num = null;
        motorControlCommand_num = new String[]{
                "1.托盘张开位置", "2.管架抬升到位", "3.抓管左上点", "4.抓管右上点", "5.抓管左下点", "6.试管右下点", "7.夹爪释放位置", "8.空爪安全位置",
                "9.带管安全位置", "10.扫码位置", "11.开盖位置", "12.取大tip头右上点", "13.取大tip头左上点", "14.取大tip头右下点", "15.取大tip头左下点", "16.深孔板右上点",
                "17.深孔板左上点", "18.深孔板右下点", "19.深孔板左下点", "20.吸液位置", "21.tip头丢弃位上", "22.tip头丢弃位中", "23.tip头丢弃位下",
                //"24.深孔板上方位置1", "25.深孔板上方位置2", "26.深孔板上方位置3", "27.深孔板上方位置4",
                "-----------","-----------","-----------","-----------",
                "28.仓库复位位置",
                //"29.仓库挡板可运动位置",
                "30.料架可旋转位置", "31.料架上抬位置",
                "32.仓库1号位取准备", "33.仓库1号位取", "34.仓库1号位放", "35.仓库1号位放准备", "36.仓库2号位取准备", "37.仓库2号位取", "38.仓库2号位放", "39.仓库2号位放准备",
                "40.仓库3号位取准备", "41.仓库3号位取", "42.仓库3号位放", "43.仓库3号位放准备", "44.仓库4号位取准备", "45.仓库4号位取", "46.仓库4号位放", "47.仓库4号位放准备",
                "48.仓库5号位取准备", "49.仓库5号位取", "50.仓库5号位放", "51.仓库5号位放准备", "52.仓库6号位取准备", "53.仓库6号位取", "54.仓库6号位放", "55.仓库6号位放准备",
                //"56.机械臂位置1", "57.机械臂位置2", "58.机械臂位置3", "59.机械臂位置4",
                "-----------","-----------","-----------","-----------",
                "60.取管最大位置" , "61.二次扫码位置" ,
                "-----------",
                //"62.试管在夹爪内调整位置 " ,
                "63.蛋白酶吸液位置 " , "64.蛋白酶吸液最低位置",
                //"65.单采吸液位置" , "66.单采吸液下限位置", "67.混采吸液位置", "68.混采吸液下限位置",
                "-----------","-----------","-----------","-----------"
                ,"65.采液位置"
                , "69.候补tip头右顶点位置","70.候补tip头左顶点位置","71.候补tip头右底点位置","72.候补tip头左底点位置"
        };
//        if(middlewareUtilDemo.preworkStationClientThreadDemo.getIp_address().equals("192.168.0.1")){
//            motorControlCommand_num = new String[]{"1.托盘左上角", "2.托盘右上角", "3.托盘左下角","4.夹管Z轴无试管时的安全高度"
//                    ,"5.旋盖转折点","6.旋盖开盖位置","7.旋盖扫码位置","8.夹管三轴在旋盖附近暂停位置","9.旋盖吸液位置","10.旋盖液位探测起始高度","11.旋盖吸液位置高度"
//                    ,"12.移液三轴在旋盖附近暂停位置","13.小试管1号管吸液位","14.小试管5号管吸液位","15.小试管液位探测起始高度","16.小试管吸液位置高度","17.小试管液体混合时的高度","18.第一排8联管1号管","19.第一排8联管8号管"
//                    ,"20.1号TIP头盒左上角","21.1号TIP头盒右上角","22.1号TIP头盒左下角","23.2号TIP头盒左上角","24.2号TIP头盒右上角","25.2号TIP头盒左下角","26.插TIP头的起始高度","27.废料桶上角","28.废料桶中间","29.废料桶下角"
//                    ,"30.第二排8联管1号管左角","31.第二排8联管8号管右角","32.接漏电机","51.搬运四轴取8联管位置","52.搬运四轴送8联管位置","53.搬运四轴安全停放位置"
//            };
//        }else if(middlewareUtilDemo.preworkStationClientThreadDemo.getIp_address().equals("192.168.0.2")){
//            motorControlCommand_num = new String[]{"1.8联管托盘1","2.8联管托盘2","3.8联管托盘3","4.8联管托盘4","5.转折点1","6.转折点2","7.转折点3","8.8联管送货位置","9.安全停靠位置"};
//        }


        JComboBox motorControlCommand_num_comboBox = new JComboBox<String>(motorControlCommand_num);
        motorControlCommand_num_comboBox.setPreferredSize(new Dimension(250, 30));
        motorControlCommand_num_comboBox.setFont(font);

//        JLabel motorControlCommand_num_jLabel = new JLabel("电机号");
//        motorControlCommand_num_jLabel.setFont(font);
//        String[] motorControlCommand_num2 = new String[]{"1.抓管三轴X轴电机", "2.抓管三轴Y轴电机",
//                "3.抓管三轴Z轴电机", "4.移液三轴Y轴电机", "5.移液三轴X轴电机", "6.移液三轴Z轴电机", "7.移液接漏电机"
//                , "8.搬运(下舱)四轴X轴电机", "9.搬运(下舱)四轴Y轴电机", "10.搬运(下舱)四轴Z轴电机", "11.搬运(下舱卡紧电机)四轴R轴电机", "12.门电机"};
//        JComboBox motorControlCommand_num_comboBox2 = new JComboBox<String>(motorControlCommand_num2);
//        motorControlCommand_num_comboBox2.setPreferredSize(new Dimension(200, 30));
//        motorControlCommand_num_comboBox2.setFont(font);


//        JTextField gripperControlCommand_num_jTextField = new JTextField();
//        gripperControlCommand_num_jTextField.setPreferredSize(new Dimension(245, 30));
//        gripperControlCommand_num_jTextField.setFont(font);


        prompt_jButton = new JButton("参数提示");
        prompt_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JDialog jFrame = new JDialog();
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setPreferredSize(new Dimension(1460, 900));

                JPanel prompt_message_num_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_num_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_num = new JLabel("定位位置编号:");
                prompt_message_num_jPanel.add(prompt_message_num);
                prompt_message_jPanel.add(prompt_message_num_jPanel);

                JPanel prompt_message_num_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_num_fourth_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_fourth_num = new JLabel("具体位置编号：1~99");
                prompt_message_num_fourth_jPanel.add(prompt_message_fourth_num);
                prompt_message_jPanel.add(prompt_message_num_fourth_jPanel);

                jFrame.add(prompt_message_jPanel);
                jFrame.setVisible(true);
                jFrame.setBounds(180, 340, 1050, 500);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        //标定设置命令
        gripperControlCommand_jButton.addActionListener(e -> {
            // TODO Auto-generated method stub
            int motorControlCommand_num_selectedIndex = motorControlCommand_num_comboBox.getSelectedIndex();
            String gripperControlCommand_num_text = String.valueOf(motorControlCommand_num_selectedIndex + 1);
            System.out.println("标定位置设置命令——>标定位置编号：" + gripperControlCommand_num_text);
//            String gripperControlCommand_num_text = gripperControlCommand_num_jTextField.getText();
            if (gripperControlCommand_num_text == null || gripperControlCommand_num_text.equals("")) {
                JOptionPane.showMessageDialog(null, "标定位置参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int i = JOptionPane.showConfirmDialog(mainPanel, "请确认位置信息是否正确?", "确认信息", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                System.out.println("标定位置设置命令——>标定位置编号：" + gripperControlCommand_num_text);
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.stationSaveControl(Integer.parseInt(gripperControlCommand_num_text));
                logger.info("发送标定位置保存命令!");
            } else if (i == 1) {
                return;
            }

        });

        adpParamControlCommand_jButton.addActionListener(e -> {
            //adp_param_support
            OrangeMain.adpConfigInfoList.clear();
            //读取adp配置
            AdpConfigInfo configInfo = OrangeMain.readAdpConfigFile(3);
            OrangeMain.adpConfigInfoList.add(configInfo);
            AdpEditDialog dialog= new AdpEditDialog(configInfo,false);
            if (dialog.confirmFlag==0)
            {
                //保存adp配置
                OrangeMain.writeAdpPropertyFile(configInfo);
                OrangeMain.adpConfigInfoList.set(0,configInfo);
                OrangeMain.sendAdpParameters();
            }

        });


//        //电机控制命令
//        motorControlCommand_jButton.addActionListener(e->{
//            int motorControlCommand_num_selectedIndex = motorControlCommand_num_comboBox2.getSelectedIndex();
//            String motorControlCommand_num_text = String.valueOf(motorControlCommand_num_selectedIndex + 1);
//            String s = jT1.getValue().toString();
//            System.out.println("标定位置设置命令——>电机号："+motorControlCommand_num_text.trim());
//            System.out.println("标定位置设置命令——>运动距离："+s);
//
//            if (!isDouble(s.trim())) {
//                JOptionPane.showMessageDialog(null, "运动距离参数格式有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            if (motorControlCommand_num_text.equals("") || motorControlCommand_num_text == null) {
//                JOptionPane.showMessageDialog(null, "参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            middlewareUtilDemo.preworkStationClientThreadDemo.statusRequestINIT();
//            try {
//                Thread.sleep(200);
//                //毫米转换成步数
//                middlewareUtilDemo.preworkStationClientThreadDemo.clipMachineControl(Integer.parseInt(motorControlCommand_num_text.trim()), s.trim());
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        });
//
//        //移动到指定位置
//        /**
//         *  先发送查询标定位置信息命令
//         *  再发送移动到标定位置命令
//         */
//        motorControlCommand_jButton2.addActionListener((e)->{
//            int motorControlCommand_num_selectedIndex = motorControlCommand_num_comboBox.getSelectedIndex();
//            if(motorControlCommand_num_selectedIndex==32||motorControlCommand_num_selectedIndex==33||motorControlCommand_num_selectedIndex==34){
//                motorControlCommand_num_selectedIndex+=18;
//            }
//            String gripperControlCommand_num_text = String.valueOf(motorControlCommand_num_selectedIndex + 1);
//            System.out.println("标定位置设置命令——>定位位置编号："+gripperControlCommand_num_text);
//            if (gripperControlCommand_num_text == null || gripperControlCommand_num_text.equals("")) {
//                JOptionPane.showMessageDialog(null, "定位位置编号参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            middlewareUtilDemo.preworkStationClientThreadDemo.clipMachineControlToBiaoDing(Integer.parseInt(gripperControlCommand_num_text));
//        });
//
//
//        //Z轴位置自动标定命令
//        motorControlCommand_jButton22.addActionListener((e)->{
//            int motorControlCommand_num_selectedIndex = motorControlCommand_num_comboBox.getSelectedIndex();
//            String gripperControlCommand_num_text = String.valueOf(motorControlCommand_num_selectedIndex + 1);
//            System.out.println("标定位置设置命令——>定位位置编号："+gripperControlCommand_num_text);
//            if (gripperControlCommand_num_text.equals(null) || gripperControlCommand_num_text.equals("")) {
//                JOptionPane.showMessageDialog(null, "参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            JOptionPane.showMessageDialog(null, "此功能暂时不需要，暂作预留，期待后续开发！", "提示", JOptionPane.INFORMATION_MESSAGE);
//        });
//
//
        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        gripperControlCommand_third_jPanel.add(myuseless_first_jPanel);
        gripperControlCommand_third_jPanel.add(gripperControlCommand_jLabel);
        gripperControlCommand_third_jPanel.setPreferredSize(new Dimension(1460, 28));
        gripperControlCommand_jPanel.add(gripperControlCommand_third_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        // motorControlCommand_jButton2.setPreferredSize(new Dimension(160, 30));
        gripperControlCommand_jButton.setPreferredSize(new Dimension(160, 30));
        adpParamControlCommand_jButton.setPreferredSize(new Dimension(160, 30));
        // motorControlCommand_jButton.setPreferredSize(new Dimension(160, 30));
        //motorControlCommand_jButton22.setPreferredSize(new Dimension(220, 30));
        // myuseless_third_jPanel.add(motorControlCommand_jButton2);
        myuseless_third_jPanel.add(gripperControlCommand_jButton);
        myuseless_third_jPanel.add(adpParamControlCommand_jButton);
        //  myuseless_third_jPanel.add(motorControlCommand_jButton);
        //  myuseless_third_jPanel.add(motorControlCommand_jButton22);


        myuseless_third_jPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(121, 30));
        gripperControlCommand_first_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        gripperControlCommand_first_jPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        gripperControlCommand_first_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        ;
        gripperControlCommand_first_jPanel.setPreferredSize(new Dimension(1460, 50));
        gripperControlCommand_jPanel.add(gripperControlCommand_first_jPanel);

        first_zero = new JPanel();
        first_zero.setPreferredSize(new Dimension(80, 48));
        gripperControlCommand_second_jPanel.add(first_zero);

        first = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        first.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        first.setPreferredSize(new Dimension(average_width, 48));
        first_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        first_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        first_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        first_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        first_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        first_firstJPanel.add(gripperControlCommand_num_jLabel);
        first_firstJPanel.add(useless_third_jPanel);
        first_secondJPanel.add(motorControlCommand_num_comboBox);
        first.add(first_firstJPanel);
        first.add(first_secondJPanel);
        gripperControlCommand_second_jPanel.add(first);

        second = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        second.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        second.setPreferredSize(new Dimension(average_width, 48));
        second_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        second_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        second_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        second_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        second_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        // second_firstJPanel.add(motorControlCommand_num_jLabel);
        second_firstJPanel.add(useless_third_jPanel);
        //  second_secondJPanel.add(motorControlCommand_num_comboBox2);
        second.add(second_firstJPanel);
        second.add(second_secondJPanel);
        gripperControlCommand_second_jPanel.add(second);

        thrid = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        thrid.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        thrid.setPreferredSize(new Dimension(average_width - 1, 48));
        thrid_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        thrid_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        thrid_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6 - 2), 46));
        thrid_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        thrid_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));

        JLabel motorControlCommand_num_jLabel2 = new JLabel("  运动距离(mm):");
        motorControlCommand_num_jLabel2.setFont(font);
        motorControlCommand_num_jLabel2.setPreferredSize(new Dimension(120, 46));

        motorControlCommand_num_jLabel2.setBackground(Color.BLUE);
        // thrid_firstJPanel.add(motorControlCommand_num_jLabel2);
        //  thrid_firstJPanel.add(jT1);

        //        thrid_firstJPanel.add(gripperControlCommand_dispow_jLabel);
        thrid_firstJPanel.add(useless_third_jPanel);
//        thrid_secondJPanel.add(gripperControlCommand_dispow_jTextField);
        thrid_secondJPanel.add(prompt_jButton);
        thrid.add(thrid_firstJPanel);
        thrid.add(thrid_secondJPanel);
        gripperControlCommand_second_jPanel.add(thrid);

        gripperControlCommand_second_jPanel.setPreferredSize(new Dimension(1460, 48));
        gripperControlCommand_jPanel.add(gripperControlCommand_second_jPanel);

        myuseless_fifth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fifth_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_sixth_jPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));

        myuseless_sixth_jPanel.setPreferredSize(new Dimension(1100, 500));


        Font contentFont = new Font("微软雅黑", Font.BOLD, (int) (25));
        Image image = Toolkit.getDefaultToolkit().getImage("src/com/keyuan/common/skin_black").getScaledInstance((int) (1080), (int) (463), Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel titleLab = new JLabel(imageIcon, JLabel.CENTER);
        titleLab.setFont(contentFont);
        titleLab.setForeground(Color.white);

        JPanel contentThirdPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        contentThirdPanel.setPreferredSize(new Dimension((int) (1080), (int) (463)));
        contentThirdPanel.add(titleLab);
        myuseless_sixth_jPanel.add(contentThirdPanel);


        // myuseless_sixth_jPanel.add(prompt_jButton);
        prompt_jButton.setPreferredSize(new Dimension(110, 30));
        myuseless_sixth_jPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue));
        myuseless_seventh_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_seventh_jPanel.setPreferredSize(new Dimension(121, 30));
        gripperControlCommand_fourth_jPanel.add(myuseless_fifth_jPanel, BorderLayout.WEST);
        gripperControlCommand_fourth_jPanel.add(myuseless_sixth_jPanel, BorderLayout.CENTER);
        gripperControlCommand_fourth_jPanel.add(myuseless_seventh_jPanel, BorderLayout.EAST);
        gripperControlCommand_fourth_jPanel.setPreferredSize(new Dimension(1460, 500));
        gripperControlCommand_fourth_jPanel.setBackground(Color.cyan);
        gripperControlCommand_jPanel.add(gripperControlCommand_fourth_jPanel);
        gripperControlCommand_jPanel.setPreferredSize(new Dimension(1460, 630));
        mainPanel.add(gripperControlCommand_jPanel);
        //----------------------------------------------------------------------//
        return mainPanel;
    }

    /**
     * 创建一个面板,用于显示线选项卡  '电机控制命令' 需要显示的内容
     *
     * @return
     */
    public JComponent motorControlCommand() {
        JPanel mainPanel = new JPanel();
        //--------------------------------电机控制命令------------------------------//
        JPanel motorControlCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorControlCommand_firstjPanel = new JPanel(new BorderLayout());
        JPanel motorControlCommand_secondjPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorControlCommand_thirdjPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorControlCommand_fourthjPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorControlCommand_fifthjPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorControlCommand_sixthjPanel = new JPanel(new BorderLayout());
        JButton motorControlCommand_jButton = new JButton("电机控制命令");

        JLabel motorControlCommand_jLabel = new JLabel("夹爪移液电机命令测试");
        motorControlCommand_jLabel.setForeground(Color.red);

        JLabel motorControlCommand_num_jLabel = new JLabel("电机号");
        motorControlCommand_num_jLabel.setFont(font);

        String[] motorControlCommand_num = new String[]{"1.抓管三轴X轴电机", "2.抓管三轴Y1轴电机",
                "3.抓管三轴Y2轴电机", "4.移液三轴X轴电机", "5.移液三轴Y轴电机", "6.仓库托盘X轴电机", "7.托盘抬升步进电机"
                , "8.仓库抬升伺服电机", "9.仓库旋转电机", "10.机械臂平移电机"};

        JComboBox motorControlCommand_num_comboBox = new JComboBox<String>(motorControlCommand_num);
        motorControlCommand_num_comboBox.setPreferredSize(new Dimension(245, 30));
        motorControlCommand_num_comboBox.setFont(font);
        JLabel motorControlCommand_posi_jLabel = new JLabel("运动步数");
        motorControlCommand_posi_jLabel.setFont(font);
        JTextField motorControlCommand_posi_jTextField = new JTextField();
        motorControlCommand_posi_jTextField.setPreferredSize(new Dimension(245, 30));
        motorControlCommand_posi_jTextField.setFont(font);
        prompt_jButton = new JButton("参数提示");
        prompt_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JDialog jFrame = new JDialog();
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setPreferredSize(new Dimension(1460, 900));


                JPanel prompt_message_num_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_num_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_num = new JLabel("电机号(过长):");
                prompt_message_num_jPanel.add(prompt_message_num);
                prompt_message_jPanel.add(prompt_message_num_jPanel);

                JPanel prompt_message_num_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_num_first_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_first_num = new JLabel("1.夹爪三轴X轴电机   2：夹爪三轴Y轴电机   3：夹爪三轴Z轴电机  ");
                prompt_message_num_first_jPanel.add(prompt_message_first_num);
                prompt_message_jPanel.add(prompt_message_num_first_jPanel);

                JPanel prompt_message_num_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_num_second_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_second_num = new JLabel("4.移液三轴Y轴电机   5：移液三轴X轴电机   6：移液三轴Z轴电机");
                prompt_message_num_second_jPanel.add(prompt_message_second_num);
                prompt_message_jPanel.add(prompt_message_num_second_jPanel);


                JPanel prompt_message_posi_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_posi_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_posi = new JLabel("运动步数:");
                prompt_message_posi_jPanel.add(prompt_message_posi);
                prompt_message_jPanel.add(prompt_message_posi_jPanel);

                JPanel prompt_message_posi_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_posi_fourth_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_fourth_posi = new JLabel("输入数字即可");
                prompt_message_posi_fourth_jPanel.add(prompt_message_fourth_posi);
                prompt_message_jPanel.add(prompt_message_posi_fourth_jPanel);
                jFrame.add(prompt_message_jPanel);

                jFrame.setVisible(true);
                jFrame.setBounds(90, 200, 1460, 760);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        motorControlCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int motorControlCommand_num_selectedIndex = motorControlCommand_num_comboBox.getSelectedIndex();
                String motorControlCommand_num_text = String.valueOf(motorControlCommand_num_selectedIndex + 1);
                String motorControlCommand_posi_text = motorControlCommand_posi_jTextField.getText();
                if (motorControlCommand_num_text.equals("") || motorControlCommand_num_text == null) {
                    JOptionPane.showMessageDialog(null, "电机编号参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                }
                if (motorControlCommand_posi_text.equals("") || motorControlCommand_posi_text == null) {
                    JOptionPane.showMessageDialog(null, "运动步数参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                }
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.clipMachineControl2(Integer.parseInt(motorControlCommand_num_text), Integer.parseInt(motorControlCommand_posi_text.trim()));
                logger.info("发送电机控制命令！");
            }
        });

        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        motorControlCommand_fifthjPanel.add(myuseless_first_jPanel);
        motorControlCommand_fifthjPanel.add(motorControlCommand_jLabel);
        motorControlCommand_fifthjPanel.setPreferredSize(new Dimension(1460, 28));
        motorControlCommand_jPanel.add(motorControlCommand_fifthjPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        myuseless_third_jPanel.add(motorControlCommand_jButton);
        motorControlCommand_jButton.setPreferredSize(new Dimension(160, 30));
        myuseless_third_jPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(121, 30));
        motorControlCommand_firstjPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        motorControlCommand_firstjPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        motorControlCommand_firstjPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        ;
        motorControlCommand_firstjPanel.setPreferredSize(new Dimension(1460, 50));
        motorControlCommand_jPanel.add(motorControlCommand_firstjPanel);

        first_zero = new JPanel();
        second_zero = new JPanel();
        third_zero = new JPanel();
        first_zero.setPreferredSize(new Dimension(80, 48));
        second_zero.setPreferredSize(new Dimension(80, 48));
        third_zero.setPreferredSize(new Dimension(80, 48));
        motorControlCommand_secondjPanel.add(first_zero);
        motorControlCommand_thirdjPanel.add(second_zero);
        motorControlCommand_fourthjPanel.add(third_zero);

        first = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        first.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        first.setPreferredSize(new Dimension(average_width, 48));
        first_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        first_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        first_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        first_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        first_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        first_firstJPanel.add(motorControlCommand_num_jLabel);
        first_firstJPanel.add(useless_third_jPanel);
        first_secondJPanel.add(motorControlCommand_num_comboBox);
        first.add(first_firstJPanel);
        first.add(first_secondJPanel);
        motorControlCommand_secondjPanel.add(first);

        second = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        second.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        second.setPreferredSize(new Dimension(average_width, 48));
        second_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        second_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        second_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        second_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        second_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        second_firstJPanel.add(motorControlCommand_posi_jLabel);
        second_firstJPanel.add(useless_third_jPanel);
        second_secondJPanel.add(motorControlCommand_posi_jTextField);
        second.add(second_firstJPanel);
        second.add(second_secondJPanel);
        motorControlCommand_secondjPanel.add(second);

        thrid = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        thrid.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        thrid.setPreferredSize(new Dimension(average_width - 1, 48));
        thrid_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        thrid_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        thrid_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        thrid_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        thrid_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        thrid_firstJPanel.add(useless_third_jPanel);
        thrid.add(thrid_firstJPanel);
        thrid.add(thrid_secondJPanel);
        motorControlCommand_secondjPanel.add(thrid);

        motorControlCommand_secondjPanel.setPreferredSize(new Dimension(1460, 48));
        motorControlCommand_jPanel.add(motorControlCommand_secondjPanel);

        myuseless_fifth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fifth_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_sixth_jPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 2, 10));
        myuseless_sixth_jPanel.add(prompt_jButton);
        prompt_jButton.setPreferredSize(new Dimension(110, 30));
        myuseless_sixth_jPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black));
        myuseless_seventh_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_seventh_jPanel.setPreferredSize(new Dimension(121, 30));
        motorControlCommand_sixthjPanel.add(myuseless_fifth_jPanel, BorderLayout.WEST);
        motorControlCommand_sixthjPanel.add(myuseless_sixth_jPanel, BorderLayout.CENTER);
        motorControlCommand_sixthjPanel.add(myuseless_seventh_jPanel, BorderLayout.EAST);
        motorControlCommand_sixthjPanel.setPreferredSize(new Dimension(1460, 50));
        motorControlCommand_jPanel.add(motorControlCommand_sixthjPanel);

        motorControlCommand_jPanel.setPreferredSize(new Dimension(1460, 200));
        mainPanel.add(motorControlCommand_jPanel);
        //-----------------------------------------------------------------------//
        return mainPanel;
    }

    /**
     * 创建一个面板,用于显示线选项卡  '电机参数读取命令' 需要显示的内容
     *
     * @return
     */
    public JComponent motorParameterReadingCommand() {
        JPanel mainPanel = new JPanel();
        //-------------------------------------电机参数读取命令----------------------------------//
        //-------------------------------------电机参数读取命令----------------------------------//
        JPanel motorParameterReadingCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterReadingCommand_secondJPanel = new JPanel(new BorderLayout());
        JPanel motorParameterReadingCommand_thirdJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterReadingCommand_fourthJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterReadingCommand_fifthJPanel = new JPanel(new BorderLayout());

        JButton motorParameterReadingCommand_jButton = new JButton("电机参数读取命令");

        JLabel motorParameterReadingCommand_jLabel = new JLabel("电机参数读取命令测试");
        motorParameterReadingCommand_jLabel.setForeground(Color.red);

        JLabel motorParameterSettingCommand_num_jLabel = new JLabel("电机号");
        motorParameterSettingCommand_num_jLabel.setFont(font);
//        String[] motorParameterSettingCommand_num = new String[]{"", "1.旋盖三轴X1轴电机", "2.旋盖三轴Y1轴电机",
//                "3.旋盖三轴Z1轴电机", "4.移液三轴Y2轴电机", "5.移液三轴X2轴电机"};
        String[] motorParameterSettingCommand_num = new String[]{"1.抓管三轴X轴电机", "2.抓管三轴Y1轴电机",
                "3.抓管三轴Y2轴电机", "4.抓管三轴Z轴电机", "5.移液三轴Y轴电机", "6.移液三轴X轴电机", "7.移液三轴Z轴电机"
                , "8.移液接漏电机", "9.搬运四轴X轴电机", "10.搬运四轴Z1轴电机", "11.搬运四轴Z2轴电机", "12.搬运四轴R轴电机", "13.门电机", "14.机械手X轴"};
        JComboBox motorParameterSettingCommand_num_comboBox = new JComboBox<String>(motorParameterSettingCommand_num);
        motorParameterSettingCommand_num_comboBox.setPreferredSize(new Dimension(150, 30));
        motorParameterSettingCommand_num_comboBox.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_num_comboBox.setFont(font);

        prompt_jButton = new JButton("参数提示");
        prompt_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JDialog jFrame = new JDialog();
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setPreferredSize(new Dimension(1460, 900));

                JPanel prompt_message_num_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_num_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_num = new JLabel("电机号(过长):");
                prompt_message_num_jPanel.add(prompt_message_num);
                prompt_message_jPanel.add(prompt_message_num_jPanel);

                JPanel prompt_message_num_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_num_second_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_second_num = new JLabel("1:抓管三轴X轴电机  2:抓管三轴Y1轴电机  3:抓管三轴Y2轴电机      4:抓管三轴Z轴电机    5:移液三轴Y轴电机   6:移液三轴X轴电机  7:移液三轴Z轴电机");
                prompt_message_num_second_jPanel.add(prompt_message_second_num);
                prompt_message_jPanel.add(prompt_message_num_second_jPanel);

                JPanel prompt_message_num_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_num_third_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_third_num = new JLabel("8.移液接漏电机       9.搬运四轴X轴电机    10.搬运四轴Z1轴电机   11.搬运四轴Z2轴电机  12.搬运四轴R轴电机  13.门电机              14.机械手X轴");
                prompt_message_num_third_jPanel.add(prompt_message_third_num);
                prompt_message_jPanel.add(prompt_message_num_third_jPanel);


                jFrame.add(prompt_message_jPanel);
                jFrame.setVisible(true);
                jFrame.setBounds(90, 200, 1460, 750);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        motorParameterReadingCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int motorParameterReadingCommand_num_selectedIndex = motorParameterSettingCommand_num_comboBox.getSelectedIndex();
                String motorParameterReadingCommand_num_text = String.valueOf(motorParameterReadingCommand_num_selectedIndex + 1);
                if (motorParameterReadingCommand_num_text.equals(null) || motorParameterReadingCommand_num_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电机编号参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                System.out.println(motorParameterReadingCommand_num_text);
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.motorInfoQueryControl(Integer.parseInt(motorParameterReadingCommand_num_text));
                logger.info("发送电机设置参数查询命令！");
                logger.info("电机编号(电机参数查询):" + motorParameterReadingCommand_num_text);
            }
        });

        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        motorParameterReadingCommand_fourthJPanel.add(myuseless_first_jPanel);
        motorParameterReadingCommand_fourthJPanel.add(motorParameterReadingCommand_jLabel);
        motorParameterReadingCommand_fourthJPanel.setPreferredSize(new Dimension(1460, 28));
        motorParameterReadingCommand_jPanel.add(motorParameterReadingCommand_fourthJPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        myuseless_third_jPanel.add(motorParameterReadingCommand_jButton);
        motorParameterReadingCommand_jButton.setPreferredSize(new Dimension(200, 30));
        myuseless_third_jPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(121, 30));
        motorParameterReadingCommand_secondJPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        motorParameterReadingCommand_secondJPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        motorParameterReadingCommand_secondJPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        ;
        motorParameterReadingCommand_secondJPanel.setPreferredSize(new Dimension(1460, 50));
        motorParameterReadingCommand_jPanel.add(motorParameterReadingCommand_secondJPanel);

        first_zero = new JPanel();
        second_zero = new JPanel();
        first_zero.setPreferredSize(new Dimension(80, 48));
        second_zero.setPreferredSize(new Dimension(80, 48));
        motorParameterReadingCommand_thirdJPanel.add(first_zero);

        first = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        first.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        first.setPreferredSize(new Dimension(average_width, 48));
        first_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        first_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        first_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        first_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        first_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        first_firstJPanel.add(motorParameterSettingCommand_num_jLabel);
        first_firstJPanel.add(useless_third_jPanel);
        first_secondJPanel.add(motorParameterSettingCommand_num_comboBox);
        first.add(first_firstJPanel);
        first.add(first_secondJPanel);
        motorParameterReadingCommand_thirdJPanel.add(first);

        second = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        second.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        second.setPreferredSize(new Dimension(average_width, 48));
        second_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        second_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        second_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        second_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        second_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        second_firstJPanel.add(useless_third_jPanel);
        second.add(second_firstJPanel);
        second.add(second_secondJPanel);
        motorParameterReadingCommand_thirdJPanel.add(second);

        thrid = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        thrid.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        thrid.setPreferredSize(new Dimension(average_width - 1, 48));
        thrid_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        thrid_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        thrid_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        thrid_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        thrid_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        thrid_firstJPanel.add(useless_third_jPanel);
        thrid.add(thrid_firstJPanel);
        thrid.add(thrid_secondJPanel);
        motorParameterReadingCommand_thirdJPanel.add(thrid);

        motorParameterReadingCommand_thirdJPanel.setPreferredSize(new Dimension(1460, 48));
        motorParameterReadingCommand_jPanel.add(motorParameterReadingCommand_thirdJPanel);

        myuseless_fifth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fifth_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_sixth_jPanel = new JPanel(new BorderLayout());

        JPanel myuseless_sixth_firstJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        myuseless_sixth_firstJPanel.setPreferredSize(new Dimension(245, 30));
        myuseless_sixth_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        JButton remove_jButton = new JButton("清除");
        remove_jButton.setPreferredSize(new Dimension(70, 30));
        remove_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                secondList.clear();
                i = 1;
                secondJList.removeAll();
                secondJList = new JList(secondList.toArray());
                Color background = new Color(238, 238, 238);
                secondJList.setBackground(background);
                secondJScrollPane.setViewportView(secondJList);
            }
        });
        myuseless_sixth_firstJPanel.add(remove_jButton);

        JPanel myuseless_sixth_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        myuseless_sixth_secondJPanel.setPreferredSize(new Dimension(80, 30));
        middle_lab2 = new JLabel("");
        secondJScrollPane = new JScrollPane();
        secondJScrollPane.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
        secondJScrollPane.setPreferredSize(new Dimension(800, 600));
        myuseless_sixth_secondJPanel.add(secondJScrollPane);

        JPanel myuseless_sixth_thirdJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        myuseless_sixth_thirdJPanel.setPreferredSize(new Dimension(169, 30));
        myuseless_sixth_thirdJPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.black));
        myuseless_sixth_thirdJPanel.add(prompt_jButton);
        prompt_jButton.setPreferredSize(new Dimension(110, 30));

        myuseless_sixth_jPanel.add(myuseless_sixth_firstJPanel, BorderLayout.WEST);
        myuseless_sixth_jPanel.add(myuseless_sixth_secondJPanel, BorderLayout.CENTER);
        myuseless_sixth_jPanel.add(myuseless_sixth_thirdJPanel, BorderLayout.EAST);
        myuseless_sixth_jPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black));
        myuseless_seventh_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_seventh_jPanel.setPreferredSize(new Dimension(121, 30));
        motorParameterReadingCommand_fifthJPanel.add(myuseless_fifth_jPanel, BorderLayout.WEST);
        motorParameterReadingCommand_fifthJPanel.add(myuseless_sixth_jPanel, BorderLayout.CENTER);
        motorParameterReadingCommand_fifthJPanel.add(myuseless_seventh_jPanel, BorderLayout.EAST);
        motorParameterReadingCommand_fifthJPanel.setPreferredSize(new Dimension(1460, 600));
        motorParameterReadingCommand_jPanel.add(motorParameterReadingCommand_fifthJPanel);

        motorParameterReadingCommand_jPanel.setPreferredSize(new Dimension(1460, 800));
        mainPanel.add(motorParameterReadingCommand_jPanel);
        //-----------------------------------------------------------------------//
        //-----------------------------------------------------------------------//
        return mainPanel;
    }

    /**
     * 创建一个面板,用于显示线选项卡  '电机参数设置命令 ' 需要显示的内容
     *
     * @return
     */
    public JComponent motorParameterSettingCommand() {
        JPanel mainPanel = new JPanel();
        // --------------------------------电机参数设置命令------------------------------//
        JPanel motorParameterSettingCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterSettingCommand_title_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterSettingCommand_first_jPanel = new JPanel(new BorderLayout());
        JPanel motorParameterSettingCommand_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterSettingCommand_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterSettingCommand_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel motorParameterSettingCommand_fifth_jPanel = new JPanel(new BorderLayout());
        JButton motorParameterSettingCommand_jButton = new JButton("电机参数设置命令");

        JLabel motorParameterSettingCommand_jLabel = new JLabel("电机参数设置命令测试");
        motorParameterSettingCommand_jLabel.setForeground(Color.red);

        JLabel motorParameterSettingCommand_num_jLabel = new JLabel("电机号");
        motorParameterSettingCommand_num_jLabel.setFont(font);
        String[] motorParameterSettingCommand_num = new String[]{"1.抓管三轴X轴电机", "2.抓管三轴Y1轴电机",
                "3.抓管三轴Y2轴电机", "4.抓管三轴Z轴电机", "5.移液三轴Y轴电机", "6.移液三轴X轴电机", "7.移液三轴Z轴电机"
                , "8.移液接漏电机", "9.搬运四轴X轴电机", "10.搬运四轴Z1轴电机", "11.搬运四轴Z2轴电机", "12.搬运四轴R轴电机", "门电机", "机械手X轴"};
        JComboBox motorParameterSettingCommand_num_comboBox = new JComboBox<String>(motorParameterSettingCommand_num);
        motorParameterSettingCommand_num_comboBox.setPreferredSize(new Dimension(150, 30));
        motorParameterSettingCommand_num_comboBox.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_num_comboBox.setFont(font);

        JLabel motorParameterSettingCommand_vMax_jLabel = new JLabel("最大速度");
        motorParameterSettingCommand_vMax_jLabel.setFont(font);
        JTextField motorParameterSettingCommand_vMax_jTextField = new JTextField();
        motorParameterSettingCommand_vMax_jTextField.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_vMax_jTextField.setFont(font);

        JLabel motorParameterSettingCommand_speed_jLabel = new JLabel("初始化速度");
        motorParameterSettingCommand_speed_jLabel.setFont(font);
        JTextField motorParameterSettingCommand_speed_jTextField = new JTextField();
        motorParameterSettingCommand_speed_jTextField.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_speed_jTextField.setFont(font);

        JLabel motorParameterSettingCommand_aMax_jLabel = new JLabel("加速度");
        motorParameterSettingCommand_aMax_jLabel.setFont(font);
        JTextField motorParameterSettingCommand_aMax_jTextField = new JTextField();
        motorParameterSettingCommand_aMax_jTextField.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_aMax_jTextField.setFont(font);


        JLabel motorParameterSettingCommand_iMax_jLabel = new JLabel("电流(启动)");
        motorParameterSettingCommand_iMax_jLabel.setFont(font);
        JTextField motorParameterSettingCommand_iMax_time_jTextFielde = new JTextField();
        motorParameterSettingCommand_iMax_time_jTextFielde.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_iMax_time_jTextFielde.setFont(font);

        JLabel motorParameterSettingCommand_IRun_jLabel = new JLabel("电流(运行)");
        motorParameterSettingCommand_IRun_jLabel.setFont(font);
        JTextField motorParameterSettingCommand_IRun_jTextField = new JTextField();
        motorParameterSettingCommand_IRun_jTextField.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_IRun_jTextField.setFont(font);

        JLabel motorParameterSettingCommand_IHold_jLabel = new JLabel("电流(保持)");
        motorParameterSettingCommand_IHold_jLabel.setFont(font);
        JTextField motorParameterSettingCommand_IHole_jTextField = new JTextField();
        motorParameterSettingCommand_IHole_jTextField.setPreferredSize(new Dimension(245, 30));
        motorParameterSettingCommand_IHole_jTextField.setFont(font);


        prompt_jButton = new JButton("参数提示");
        prompt_jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                JDialog jFrame = new JDialog();
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setPreferredSize(new Dimension(1460, 900));

                JPanel prompt_message_num_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_num_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_num = new JLabel("电机号(过长):");
                prompt_message_num_jPanel.add(prompt_message_num);
                prompt_message_jPanel.add(prompt_message_num_jPanel);

                JPanel prompt_message_num_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_num_second_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_second_num = new JLabel("类型:1.抓管三轴X轴电机  2.抓管三轴Y轴电机  3.抓管三轴Z轴电机  4.移液三轴Y轴电机 5.移液三轴X轴电机");
                prompt_message_num_second_jPanel.add(prompt_message_second_num);
                prompt_message_jPanel.add(prompt_message_num_second_jPanel);

                JPanel prompt_message_num_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
                prompt_message_num_third_jPanel.setPreferredSize(new Dimension(1460, 30));
                JLabel prompt_message_third_num = new JLabel("6.移液三轴Z轴电机    7。移液接漏电机 8.搬运(下舱)四轴X轴电机 9.搬运(下舱)四轴Y轴电机 ");
                prompt_message_num_third_jPanel.add(prompt_message_third_num);
                prompt_message_jPanel.add(prompt_message_num_third_jPanel);
                jFrame.add(prompt_message_jPanel);
                jFrame.setVisible(true);
                jFrame.setBounds(130, 340, 1180, 500);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        motorParameterSettingCommand_jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int motorParameterSettingCommand_num_selectedIndex = motorParameterSettingCommand_num_comboBox.getSelectedIndex();
                //电机号
                String motorParameterSettingCommand_num_text = String.valueOf(motorParameterSettingCommand_num_selectedIndex + 1);
                logger.info("电机编号：" + motorParameterSettingCommand_num_text);
                //最大速度
                String motorParameterSettingCommand_vMax_text = motorParameterSettingCommand_vMax_jTextField.getText();
                logger.info("最大速度:" + motorParameterSettingCommand_vMax_text);
                //初始化速度
                String motorParameterSettingCommand_speed_text = motorParameterSettingCommand_speed_jTextField.getText();
                logger.info("初始化速度:" + motorParameterSettingCommand_speed_text);
                //加速度
                String motorParameterSettingCommand_aMax_text = motorParameterSettingCommand_aMax_jTextField.getText();
                logger.info("加速度:" + motorParameterSettingCommand_aMax_text);
                //电流（启动）
                String motorParameterSettingCommand_iMax_text = motorParameterSettingCommand_iMax_time_jTextFielde.getText();
                logger.info("电流（启动）:" + motorParameterSettingCommand_iMax_text);
                //电流（运行）
                String motorParameterSettingCommand_IRun_text = motorParameterSettingCommand_IRun_jTextField.getText();
                logger.info("电流（运行）:" + motorParameterSettingCommand_IRun_text);
                //电流（保持）
                String motorParameterSettingCommand_IHole_text = motorParameterSettingCommand_IHole_jTextField.getText();
                logger.info("电流（保持）:" + motorParameterSettingCommand_IHole_text);
                if (motorParameterSettingCommand_num_text.equals(null) || motorParameterSettingCommand_num_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电机编号参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (motorParameterSettingCommand_vMax_text.equals(null) || motorParameterSettingCommand_vMax_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电机最大速度参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (motorParameterSettingCommand_speed_text.equals(null) || motorParameterSettingCommand_speed_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电机初始速度参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (motorParameterSettingCommand_aMax_text.equals(null) || motorParameterSettingCommand_aMax_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电机加速度参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (motorParameterSettingCommand_iMax_text.equals(null) || motorParameterSettingCommand_iMax_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电流（启动）参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (motorParameterSettingCommand_IRun_text == null || motorParameterSettingCommand_IRun_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电流（运行）参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (motorParameterSettingCommand_IHole_text == null || motorParameterSettingCommand_IHole_text.equals("")) {
                    JOptionPane.showMessageDialog(null, "电流（保持）参数有误,请仔细核对", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.motorSaveControl(
                        new MotorParameterSettingCommandModelTwo(
                                Integer.parseInt(motorParameterSettingCommand_num_text),
                                Integer.parseInt(motorParameterSettingCommand_vMax_text),
                                Integer.parseInt(motorParameterSettingCommand_speed_text),
                                Integer.parseInt(motorParameterSettingCommand_aMax_text),
                                Integer.parseInt(motorParameterSettingCommand_iMax_text),
                                Integer.parseInt(motorParameterSettingCommand_IRun_text),
                                Integer.parseInt(motorParameterSettingCommand_IHole_text)));
            }
        });

        first_zero = new JPanel();
        second_zero = new JPanel();
        first_zero.setPreferredSize(new Dimension(80, 48));
        second_zero.setPreferredSize(new Dimension(80, 48));
        motorParameterSettingCommand_second_jPanel.add(first_zero);
        motorParameterSettingCommand_third_jPanel.add(second_zero);

        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        motorParameterSettingCommand_title_jPanel.add(myuseless_first_jPanel);
        motorParameterSettingCommand_title_jPanel.add(motorParameterSettingCommand_jLabel);
        motorParameterSettingCommand_title_jPanel.setPreferredSize(new Dimension(1460, 28));
        motorParameterSettingCommand_jPanel.add(motorParameterSettingCommand_title_jPanel);

        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 8));
        myuseless_third_jPanel.add(motorParameterSettingCommand_jButton);
        myuseless_third_jPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(121, 30));
        motorParameterSettingCommand_first_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        motorParameterSettingCommand_first_jPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        motorParameterSettingCommand_first_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        ;
        motorParameterSettingCommand_first_jPanel.setPreferredSize(new Dimension(1460, 50));
        motorParameterSettingCommand_jPanel.add(motorParameterSettingCommand_first_jPanel);

        first = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        first.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        first.setPreferredSize(new Dimension(average_width, 48));
        first_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        first_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        first_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        first_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        first_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        first_firstJPanel.add(motorParameterSettingCommand_num_jLabel);
        first_firstJPanel.add(useless_third_jPanel);
        first_secondJPanel.add(motorParameterSettingCommand_num_comboBox);
        first.add(first_firstJPanel);
        first.add(first_secondJPanel);
        motorParameterSettingCommand_second_jPanel.add(first);

        second = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        second.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        second.setPreferredSize(new Dimension(average_width, 48));
        second_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        second_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        second_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        second_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        second_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        second_firstJPanel.add(motorParameterSettingCommand_vMax_jLabel);
        second_firstJPanel.add(useless_third_jPanel);
        second_secondJPanel.add(motorParameterSettingCommand_vMax_jTextField);
        second.add(second_firstJPanel);
        second.add(second_secondJPanel);
        motorParameterSettingCommand_second_jPanel.add(second);

        thrid = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        thrid.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));
        thrid.setPreferredSize(new Dimension(average_width - 1, 48));
        thrid_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        thrid_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        thrid_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        thrid_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        thrid_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        thrid_firstJPanel.add(motorParameterSettingCommand_speed_jLabel);
        thrid_firstJPanel.add(useless_third_jPanel);
        thrid_secondJPanel.add(motorParameterSettingCommand_speed_jTextField);
        thrid.add(thrid_firstJPanel);
        thrid.add(thrid_secondJPanel);
        motorParameterSettingCommand_second_jPanel.add(thrid);

        motorParameterSettingCommand_jPanel.add(motorParameterSettingCommand_second_jPanel);
        motorParameterSettingCommand_second_jPanel.setPreferredSize(new Dimension(1460, 48));

        fourth = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fourth.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black));
        fourth.setPreferredSize(new Dimension(average_width, 48));
        fourth_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        fourth_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        fourth_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        fourth_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        fourth_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        fourth_firstJPanel.add(motorParameterSettingCommand_aMax_jLabel);
        fourth_firstJPanel.add(useless_third_jPanel);
        fourth_secondJPanel.add(motorParameterSettingCommand_aMax_jTextField);
        fourth.add(fourth_firstJPanel);
        fourth.add(fourth_secondJPanel);
        motorParameterSettingCommand_third_jPanel.add(fourth);

        fifth = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        fifth.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.black));
        fifth.setPreferredSize(new Dimension(average_width, 48));
        fifth_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        fifth_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        fifth_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        fifth_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        fifth_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        fifth_firstJPanel.add(motorParameterSettingCommand_iMax_jLabel);
        fifth_firstJPanel.add(useless_third_jPanel);
        fifth_secondJPanel.add(motorParameterSettingCommand_iMax_time_jTextFielde);
        fifth.add(fifth_firstJPanel);
        fifth.add(fifth_secondJPanel);
        motorParameterSettingCommand_third_jPanel.add(fifth);

        sixth = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        sixth.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.black));
        sixth.setPreferredSize(new Dimension(average_width - 1, 48));
        sixth_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        sixth_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        sixth_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        sixth_firstJPanel.add(motorParameterSettingCommand_IRun_jLabel);
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        sixth_firstJPanel.add(useless_third_jPanel);
        sixth_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        sixth_secondJPanel.add(motorParameterSettingCommand_IRun_jTextField);
        sixth_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        sixth.add(sixth_firstJPanel);
        sixth.add(sixth_secondJPanel);
        motorParameterSettingCommand_third_jPanel.add(sixth);
        motorParameterSettingCommand_third_jPanel.setPreferredSize(new Dimension(1460, 48));
        motorParameterSettingCommand_jPanel.add(motorParameterSettingCommand_third_jPanel);

        seventeen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        seventeen.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
        seventeen.setPreferredSize(new Dimension(average_width, 48));
        seventeen_seventeenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        seventeen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        seventeen_seventeenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        seventeen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        seventeen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        seventeen_useJpanel.setPreferredSize(new Dimension(10, 46));
        seventeen_seventeenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        seventeen_seventeenJpanel.add(motorParameterSettingCommand_IHold_jLabel);
        seventeen_seventeenJpanel.add(seventeen_useJpanel);
        seventeen_sencondJpanel.add(motorParameterSettingCommand_IHole_jTextField);
        seventeen.add(seventeen_seventeenJpanel);
        seventeen.add(seventeen_sencondJpanel);
        JPanel empt = new JPanel();
        empt.setPreferredSize(new Dimension(80, 48));
        motorParameterSettingCommand_fourth_jPanel.add(empt);
        motorParameterSettingCommand_fourth_jPanel.add(seventeen);

        eighteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eighteen.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
        eighteen.setPreferredSize(new Dimension(average_width, 48));
        eighteen_eighteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        eighteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        eighteen_eighteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        eighteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        eighteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        eighteen_useJpanel.setPreferredSize(new Dimension(10, 46));
        eighteen_eighteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        // eighteen_eighteenJpanel.add();
        eighteen_eighteenJpanel.add(eighteen_useJpanel);
        // eighteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_21);
        eighteen.add(eighteen_eighteenJpanel);
        eighteen.add(eighteen_sencondJpanel);
        motorParameterSettingCommand_fourth_jPanel.add(eighteen);

        twentytwo = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentytwo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        twentytwo.setPreferredSize(new Dimension(average_width, 48));
        twentytwo_twentytwoJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        twentytwo_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        twentytwo_twentytwoJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        twentytwo_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        twentytwo_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        twentytwo_useJpanel.setPreferredSize(new Dimension(10, 46));
        twentytwo_twentytwoJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        twentytwo_sencondJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        // twentytwo_twentytwoJpanel.add(motorControlCommand_num_jLabel_22);
        twentytwo_twentytwoJpanel.add(twentytwo_useJpanel);
        // twentytwo_sencondJpanel.add(motorControlCommand_posi_jTextField1_22);
        twentytwo.add(twentytwo_twentytwoJpanel);
        twentytwo.add(twentytwo_sencondJpanel);
        motorParameterSettingCommand_fourth_jPanel.add(twentytwo);

        motorParameterSettingCommand_fourth_jPanel.setPreferredSize(new Dimension(1460, 48));
        motorParameterSettingCommand_jPanel.add(motorParameterSettingCommand_fourth_jPanel);

        myuseless_fifth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fifth_jPanel.setPreferredSize(new Dimension(80, 30));
        myuseless_sixth_jPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 2, 10));
        myuseless_sixth_jPanel.add(prompt_jButton);
        prompt_jButton.setPreferredSize(new Dimension(110, 30));
        myuseless_sixth_jPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black));
        myuseless_seventh_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_seventh_jPanel.setPreferredSize(new Dimension(121, 30));
        motorParameterSettingCommand_fifth_jPanel.add(myuseless_fifth_jPanel, BorderLayout.WEST);
        motorParameterSettingCommand_fifth_jPanel.add(myuseless_sixth_jPanel, BorderLayout.CENTER);
        motorParameterSettingCommand_fifth_jPanel.add(myuseless_seventh_jPanel, BorderLayout.EAST);
        motorParameterSettingCommand_fifth_jPanel.setPreferredSize(new Dimension(1460, 48));
        motorParameterSettingCommand_jPanel.add(motorParameterSettingCommand_fifth_jPanel);

        motorParameterSettingCommand_jPanel.setPreferredSize(new Dimension(1460, 300));
        mainPanel.add(motorParameterSettingCommand_jPanel);
        // ----------------------------------------------------------------------//
        return mainPanel;
    }


    /**
     * 创建一个面板,用于显示线选项卡 '查询及控制命令' 需要显示的内容
     *
     * @return
     */
    public JComponent robotSelectOrControl() {
        JPanel mainPanel = new JPanel();
        // --------------------------------查询及控制命令------------------------------//
        JButton sendCommand_jButton = new JButton("发送控制命令");
        sendCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                ControlDataTwoRobotModel controlDataTwoRobotModel = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel();
                //升降台动作序号
                String platfromSeq = motorControlCommand_posi_jTextField1_2_robot.getText();
                if (!StringHelper.isEmpty(platfromSeq)) {
                    controlDataTwoRobotModel.setPlatfromSeq(Integer.parseInt(platfromSeq));
                }
                //升降台1位置
                String platform1Station = motorControlCommand_posi_jTextField1_3_robot.getText();
                if (!StringHelper.isEmpty(platform1Station)) {
                    controlDataTwoRobotModel.setPlatform1Station(Integer.parseInt(platform1Station));
                }
                //升降台2位置
                String platform2Station = motorControlCommand_posi_jTextField1_4_robot.getText();
                if (!StringHelper.isEmpty(platform2Station)) {
                    controlDataTwoRobotModel.setPlatform2Station(Integer.parseInt(platform2Station));
                }
                //机械手X轴动作序号
                String robotXSeq = motorControlCommand_posi_jTextField1_5_robot.getText();
                if (!StringHelper.isEmpty(robotXSeq)) {
                    controlDataTwoRobotModel.setRobotXSeq(Integer.parseInt(robotXSeq));
                }
                //机械手X轴动作目标位置
                String robotXToStation = motorControlCommand_posi_jTextField1_6_robot.getText();
                if (!StringHelper.isEmpty(robotXToStation)) {
                    controlDataTwoRobotModel.setRobotXToStation(Integer.parseInt(robotXToStation));
                }
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.statusRequest2(controlDataTwoRobotModel);
                logger.info("robot发送电机控制命令！");
            }
        });


        // 发送控制父容器
        send = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        send.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        send.setPreferredSize(new Dimension(450, 1508));
        JScrollPane jScrollPane2 = new JScrollPane(send);
        jScrollPane2.setPreferredSize(new Dimension(450, 748));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(30);
        mainPanel.add(jScrollPane2);

        // 查询父容器
        select = new JPanel();
        select.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        select.setPreferredSize(new Dimension(950, 748));
        mainPanel.add(select);

        JButton em_reset = new JButton("电机复位");
        em_reset.setFont(font);
        em_reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // TODO Auto-generated method stub
                JDialog jFrame = new JDialog();
                jFrame.setTitle("电机复位");
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setLayout(null);
                prompt_message_jPanel.setPreferredSize(new Dimension(450, 1248));
                JScrollPane jScrollPane = new JScrollPane(prompt_message_jPanel);
                jScrollPane.setPreferredSize(new Dimension(200, 400));
                jScrollPane.getVerticalScrollBar().setUnitIncrement(30);

                JLabel jLabel23 = new JLabel("BIT23 0");
                jLabel23.setBounds(10, 1160, 390, 20);
                prompt_message_jPanel.add(jLabel23);

                JLabel jLabel22 = new JLabel("BIT22 预留");
                jLabel22.setBounds(10, 1100, 390, 20);
                prompt_message_jPanel.add(jLabel22);


                JLabel jLabel21 = new JLabel("BIT21 预留");
                jLabel21.setBounds(10, 1060, 390, 20);
                prompt_message_jPanel.add(jLabel21);

                JLabel jLabel20 = new JLabel("BIT20 预留");
                jLabel20.setBounds(10, 1010, 390, 20);
                prompt_message_jPanel.add(jLabel20);

                JLabel jLabel19 = new JLabel("BIT19 预留");
                jLabel19.setBounds(10, 960, 390, 20);
                prompt_message_jPanel.add(jLabel19);

                JLabel jLabel18 = new JLabel("BIT18 参数报警复位 0：不复位 1：复位");
                jLabel18.setBounds(10, 910, 390, 20);
                prompt_message_jPanel.add(jLabel18);

                JLabel jLabel17 = new JLabel("BIT17 机械臂X轴复位 0：不复位 1：复位");
                jLabel17.setBounds(10, 860, 390, 20);
                prompt_message_jPanel.add(jLabel17);

                JLabel jLabel16 = new JLabel("BIT16 ");
                jLabel16.setBounds(10, 810, 390, 20);
                prompt_message_jPanel.add(jLabel16);

                JLabel jLabel15 = new JLabel("BIT15 ");
                jLabel15.setBounds(10, 760, 390, 20);
                prompt_message_jPanel.add(jLabel15);

                JLabel jLabel14 = new JLabel("BIT14  ");
                jLabel14.setBounds(10, 710, 390, 20);
                prompt_message_jPanel.add(jLabel14);

                JLabel jLabel13 = new JLabel("BIT13 ");
                jLabel13.setBounds(10, 660, 390, 20);
                prompt_message_jPanel.add(jLabel13);

                JLabel jLabel12 = new JLabel("BIT12 ");
                jLabel12.setBounds(10, 610, 390, 20);
                prompt_message_jPanel.add(jLabel12);

                JLabel jLabel11 = new JLabel("BIT11 ");
                jLabel11.setBounds(10, 560, 390, 20);
                prompt_message_jPanel.add(jLabel11);

                JLabel jLabel10 = new JLabel("BIT10 ");
                jLabel10.setBounds(10, 510, 390, 20);
                prompt_message_jPanel.add(jLabel10);

                JLabel jLabel9 = new JLabel("BIT9 ");
                jLabel9.setBounds(10, 460, 390, 20);
                prompt_message_jPanel.add(jLabel9);

                JLabel jLabel8 = new JLabel("BIT8 ");
                jLabel8.setBounds(10, 410, 390, 20);
                prompt_message_jPanel.add(jLabel8);

                JLabel jLabel7 = new JLabel("BIT7 ");
                jLabel7.setBounds(10, 360, 390, 20);
                prompt_message_jPanel.add(jLabel7);

                JLabel jLabel6 = new JLabel("BIT6 ");
                jLabel6.setBounds(10, 310, 390, 20);
                prompt_message_jPanel.add(jLabel6);

                JLabel jLabel5 = new JLabel("BIT5 ");
                jLabel5.setBounds(10, 260, 390, 20);
                prompt_message_jPanel.add(jLabel5);

                JLabel jLabel4 = new JLabel("BIT4 ");
                jLabel4.setBounds(10, 210, 390, 20);
                prompt_message_jPanel.add(jLabel4);

                JLabel jLabel3 = new JLabel("BIT3 ");
                jLabel3.setBounds(10, 160, 390, 20);
                prompt_message_jPanel.add(jLabel3);

                JLabel jLabel2 = new JLabel("BIT2 ");
                jLabel2.setBounds(10, 110, 390, 20);
                prompt_message_jPanel.add(jLabel2);

                JLabel jLabel1 = new JLabel("BIT1 ");
                jLabel1.setBounds(10, 60, 390, 20);
                prompt_message_jPanel.add(jLabel1);

                JLabel jLabel0 = new JLabel("BIT0 ");
                jLabel0.setBounds(10, 10, 390, 20);
                prompt_message_jPanel.add(jLabel0);

                JTextField jText23 = new JTextField();
                jText23.setBounds(410, 1160, 230, 30);
                prompt_message_jPanel.add(jText23);
//                int resetBit23 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit23();
//                jText23.setText(resetBit23 + "");

                JTextField jText22 = new JTextField();
                jText22.setBounds(410, 1110, 230, 30);
                prompt_message_jPanel.add(jText22);
//                int resetBit22 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit22();
//                jText22.setText(resetBit22 + "");

                JTextField jText21 = new JTextField();
                jText21.setBounds(410, 1060, 230, 30);
                prompt_message_jPanel.add(jText21);
//                int resetBit21 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit21();
//                jText21.setText(resetBit21 + "");

                JTextField jText20 = new JTextField();
                jText20.setBounds(410, 1010, 230, 30);
                prompt_message_jPanel.add(jText20);
//                int resetBit20 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit20();
//                jText20.setText(resetBit20 + "");

                JTextField jText19 = new JTextField();
                jText19.setBounds(410, 960, 230, 30);
                prompt_message_jPanel.add(jText19);
//                int resetBit19 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit19();
//                jText19.setText(resetBit19 + "");

                JTextField jText18 = new JTextField();
                jText18.setBounds(410, 910, 230, 30);
                prompt_message_jPanel.add(jText18);
//                int resetBit18 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit18();
//                jText18.setText(resetBit18 + "");

                JTextField jText17 = new JTextField();
                jText17.setBounds(410, 860, 230, 30);
                prompt_message_jPanel.add(jText17);
//                int resetBit17 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit17();
//                jText17.setText(resetBit17 + "");

                JTextField jText16 = new JTextField();
                jText16.setBounds(410, 810, 230, 30);
                prompt_message_jPanel.add(jText16);
//                int resetBit16 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit16();
//                jText16.setText(resetBit16 + "");

                JTextField jText15 = new JTextField();
                jText15.setBounds(410, 760, 230, 30);
                prompt_message_jPanel.add(jText15);
//                int resetBit15 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit19();
//                jText15.setText(resetBit15 + "");

                JTextField jText14 = new JTextField();
                jText14.setBounds(410, 710, 230, 30);
                prompt_message_jPanel.add(jText14);
//                int resetBit14 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit14();
//                jText14.setText(resetBit14 + "");

                JTextField jText13 = new JTextField();
                jText13.setBounds(410, 660, 230, 30);
                prompt_message_jPanel.add(jText13);
//                int resetBit13 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit13();
//                jText13.setText(resetBit13 + "");

                JTextField jText12 = new JTextField();
                jText12.setBounds(410, 610, 230, 30);
                prompt_message_jPanel.add(jText12);
//                int resetBit12 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit12();
//                jText12.setText(resetBit12 + "");

                JTextField jText11 = new JTextField();
                jText11.setBounds(410, 560, 230, 30);
                prompt_message_jPanel.add(jText11);
//                int resetBit11 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit11();
//                jText11.setText(resetBit11 + "");

                JTextField jText10 = new JTextField();
                jText10.setBounds(410, 510, 230, 30);
                prompt_message_jPanel.add(jText10);
//                int resetBit10 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit10();
//                jText10.setText(resetBit10 + "");

                JTextField jText09 = new JTextField();
                jText09.setBounds(410, 460, 230, 30);
                prompt_message_jPanel.add(jText09);
//                int resetBit9 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit9();
//                jText09.setText(resetBit9 + "");

                JTextField jText08 = new JTextField();
                jText08.setBounds(410, 410, 230, 30);
                prompt_message_jPanel.add(jText08);
//                int resetBit8 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit8();
//                jText08.setText(resetBit18 + "");

                JTextField jText07 = new JTextField();
                jText07.setBounds(410, 360, 230, 30);
                prompt_message_jPanel.add(jText07);
//                int resetBit7 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit7();
//                jText07.setText(resetBit7 + "");

                JTextField jText06 = new JTextField();
                jText06.setBounds(410, 310, 230, 30);
                prompt_message_jPanel.add(jText06);
//                int resetBit6 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit6();
//                jText06.setText(resetBit6 + "");

                JTextField jText05 = new JTextField();
                jText05.setBounds(410, 260, 230, 30);
                prompt_message_jPanel.add(jText05);
//                int resetBit5 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit5();
//                jText05.setText(resetBit5 + "");

                JTextField jText04 = new JTextField();
                jText04.setBounds(410, 210, 230, 30);
                prompt_message_jPanel.add(jText04);
//                int resetBit4 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit4();
//                jText04.setText(resetBit4 + "");

                JTextField jText03 = new JTextField();
                jText03.setBounds(410, 160, 230, 30);
                prompt_message_jPanel.add(jText03);
//                int resetBit3 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit3();
//                jText03.setText(resetBit3 + "");

                JTextField jText02 = new JTextField();
                jText02.setBounds(410, 110, 230, 30);
                prompt_message_jPanel.add(jText02);
//                int resetBit2 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit2();
//                jText02.setText(resetBit2 + "");

                JTextField jText01 = new JTextField();
                jText01.setBounds(410, 60, 230, 30);
                prompt_message_jPanel.add(jText01);
//                int resetBit1 =middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit1();
//                jText01.setText(resetBit1 + "");

                JTextField jText0 = new JTextField();
                jText0.setBounds(410, 10, 230, 30);
                prompt_message_jPanel.add(jText0);
//                int resetBit0 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getResetBit0();
//                jText0.setText(resetBit0 + "");

                JButton jButton = new JButton("确定");
                jButton.setBounds(480, 1200, 160, 30);
                prompt_message_jPanel.add(jButton);
                jButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        String jtext23 = jText23.getText();
                        String jtext22 = jText22.getText();
                        String jtext21 = jText21.getText();
                        String jtext20 = jText20.getText();
                        String jtext19 = jText19.getText();
                        String jtext18 = jText18.getText();
                        String jtext17 = jText17.getText();
                        String jtext16 = jText16.getText();
                        String jtext15 = jText15.getText();
                        String jtext14 = jText14.getText();
                        String jtext13 = jText13.getText();
                        String jtext12 = jText12.getText();
                        String jtext11 = jText11.getText();
                        String jtext10 = jText10.getText();
                        String jtext09 = jText09.getText();
                        String jtext08 = jText08.getText();
                        String jtext07 = jText07.getText();
                        String jtext06 = jText06.getText();
                        String jtext05 = jText05.getText();
                        String jtext04 = jText04.getText();
                        String jtext03 = jText03.getText();
                        String jtext02 = jText02.getText();
                        String jtext01 = jText01.getText();
                        String jtext0 = jText0.getText();
                        em_reset_jtext2.setText(jtext0 + jtext01 + jtext02 + jtext03 + jtext04 + jtext05 + jtext06 + jtext07 + jtext08 + jtext09 + jtext10 + jtext11 + jtext12 +
                                jtext13 + jtext14 + jtext15 + jtext16 + jtext17 + jtext18 + jtext19 + jtext20 + jtext21 + jtext22 + jtext23);
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit23(Integer.parseInt(jtext23));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit22(Integer.parseInt(jtext22));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit21(Integer.parseInt(jtext21));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit20(Integer.parseInt(jtext20));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit19(Integer.parseInt(jtext19));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit18(Integer.parseInt(jtext18));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit17(Integer.parseInt(jtext17));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit16(Integer.parseInt(jtext16));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit15(Integer.parseInt(jtext15));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit14(Integer.parseInt(jtext14));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit13(Integer.parseInt(jtext13));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit12(Integer.parseInt(jtext12));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit11(Integer.parseInt(jtext11));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit10(Integer.parseInt(jtext10));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit9(Integer.parseInt(jtext09));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit8(Integer.parseInt(jtext08));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit7(Integer.parseInt(jtext07));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit6(Integer.parseInt(jtext06));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit5(Integer.parseInt(jtext05));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit4(Integer.parseInt(jtext04));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit3(Integer.parseInt(jtext03));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit2(Integer.parseInt(jtext02));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit1(Integer.parseInt(jtext01));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setResetBit0(Integer.parseInt(jtext0));
                        jFrame.setVisible(false);
                        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }
                });

                jFrame.add(jScrollPane);
                jFrame.setVisible(true);
                jFrame.setBounds(200, 200, 860, 760);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        JLabel motorControlCommand_num_jLabel_2 = new JLabel("升降台动作序号");
        motorControlCommand_num_jLabel_2.setFont(font);

        JLabel motorControlCommand_num_jLabel_3 = new JLabel("升降台1位置");
        motorControlCommand_num_jLabel_3.setFont(font);

        JLabel motorControlCommand_num_jLabel_4 = new JLabel("升降台2位置");
        motorControlCommand_num_jLabel_4.setFont(font);

        JLabel motorControlCommand_num_jLabel_5 = new JLabel("机械手X轴动作序号");
        motorControlCommand_num_jLabel_5.setFont(font);

        JLabel motorControlCommand_num_jLabel_6 = new JLabel("机械手X轴动作目标位置");
        motorControlCommand_num_jLabel_6.setFont(font);

        JButton motorControlCommand_num_jLabel_7 = new JButton("IO控制");
        motorControlCommand_num_jLabel_7.setFont(font);

//        JLabel motorControlCommand_num_jLabel_8 = new JLabel("移液动作");
//        motorControlCommand_num_jLabel_8.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_9 = new JLabel("多吸多排序号(混合次数)");
//        motorControlCommand_num_jLabel_9.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_10 = new JLabel("液位探测");
//        motorControlCommand_num_jLabel_10.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_11 = new JLabel("移液量");
//        motorControlCommand_num_jLabel_11.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_12 = new JLabel("搬运动作序号");
//        motorControlCommand_num_jLabel_12.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_13 = new JLabel("搬运目标位置");
//        motorControlCommand_num_jLabel_13.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_14 = new JLabel("搬运目标位置");
//        motorControlCommand_num_jLabel_14.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_15 = new JLabel("搬运动作完成后停靠位置");
//        motorControlCommand_num_jLabel_15.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_16 = new JLabel("旋盖动作序号");
//        motorControlCommand_num_jLabel_16.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_17 = new JLabel("旋盖动作");
//        motorControlCommand_num_jLabel_17.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_18 = new JLabel("抓管三轴定位序号");
//        motorControlCommand_num_jLabel_18.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_19 = new JLabel("抓管三轴定位位置");
//        motorControlCommand_num_jLabel_19.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_20 = new JLabel("移液三轴定位序号");
//        motorControlCommand_num_jLabel_20.setFont(font);
//
//        JLabel motorControlCommand_num_jLabel_21 = new JLabel("移液三轴定位位置");
//        motorControlCommand_num_jLabel_21.setFont(font);
//
//        JButton motorControlCommand_num_jLabel_22 = new JButton("IO控制");
//        motorControlCommand_num_jLabel_22.setFont(font);


        motorControlCommand_num_jLabel_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JDialog jFrame = new JDialog();
                jFrame.setTitle("IO控制");
                JPanel prompt_message_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                prompt_message_jPanel.setLayout(null);
                prompt_message_jPanel.setPreferredSize(new Dimension(450, 868));
                JScrollPane jScrollPane = new JScrollPane(prompt_message_jPanel);
                jScrollPane.setPreferredSize(new Dimension(200, 400));
                jScrollPane.getVerticalScrollBar().setUnitIncrement(30);


                JLabel jLabel0 = new JLabel("BIT0 预留");
                jLabel0.setBounds(10, 10, 390, 20);
                prompt_message_jPanel.add(jLabel0);

                JLabel jLabel1 = new JLabel("BIT1 预留");
                jLabel1.setBounds(10, 60, 390, 20);
                prompt_message_jPanel.add(jLabel1);

                JLabel jLabel2 = new JLabel("BIT2 预留");
                jLabel2.setBounds(10, 110, 390, 20);
                prompt_message_jPanel.add(jLabel2);

                JLabel jLabel3 = new JLabel("BIT3 预留");
                jLabel3.setBounds(10, 160, 390, 20);
                prompt_message_jPanel.add(jLabel3);

                JLabel jLabel4 = new JLabel("BIT4 预留");
                jLabel4.setBounds(10, 210, 390, 20);
                prompt_message_jPanel.add(jLabel4);

                JLabel jLabel5 = new JLabel("BIT5 预留");
                jLabel5.setBounds(10, 260, 390, 20);
                prompt_message_jPanel.add(jLabel5);

                JLabel jLabel6 = new JLabel("BIT6 预留");
                jLabel6.setBounds(10, 310, 390, 20);
                prompt_message_jPanel.add(jLabel6);

                JLabel jLabel7 = new JLabel("BIT7 0 ");
                jLabel7.setBounds(10, 360, 390, 20);
                prompt_message_jPanel.add(jLabel7);

                JLabel jLabel8 = new JLabel("BIT8 预留");
                jLabel8.setBounds(10, 410, 390, 20);
                prompt_message_jPanel.add(jLabel8);

                JLabel jLabel9 = new JLabel("BIT9 预留");
                jLabel9.setBounds(10, 460, 390, 20);
                prompt_message_jPanel.add(jLabel9);

                JLabel jLabel10 = new JLabel("BIT10 预留");
                jLabel10.setBounds(10, 510, 390, 20);
                prompt_message_jPanel.add(jLabel10);

                JLabel jLabel11 = new JLabel("BIT11 预留");
                jLabel11.setBounds(10, 560, 390, 20);
                prompt_message_jPanel.add(jLabel11);

                JLabel jLabel12 = new JLabel("BIT12 紫外灯 0：OFF 1：ON");
                jLabel12.setBounds(10, 610, 390, 20);
                prompt_message_jPanel.add(jLabel12);

                JLabel jLabel13 = new JLabel("BIT13 预留");
                jLabel13.setBounds(10, 660, 390, 20);
                prompt_message_jPanel.add(jLabel13);

                JLabel jLabel14 = new JLabel("BIT14 预留");
                jLabel14.setBounds(10, 710, 390, 20);
                prompt_message_jPanel.add(jLabel14);

                JLabel jLabel15 = new JLabel("BIT15 0");
                jLabel15.setBounds(10, 760, 390, 20);
                prompt_message_jPanel.add(jLabel15);

                JTextField jText0 = new JTextField();
                jText0.setBounds(410, 10, 230, 30);
                prompt_message_jPanel.add(jText0);
//                int ioCodeBit0 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit0();
//                jText0.setText(ioCodeBit0 + "");

                JTextField jText01 = new JTextField();
                jText01.setBounds(410, 60, 230, 30);
                prompt_message_jPanel.add(jText01);
//                int ioCodeBit1 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit1();
//                jText01.setText(ioCodeBit1 + "");

                JTextField jText02 = new JTextField();
                jText02.setBounds(410, 110, 230, 30);
                prompt_message_jPanel.add(jText02);
//                int ioCodeBit2 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit2();
//                jText02.setText(ioCodeBit2 + "");

                JTextField jText03 = new JTextField();
                jText03.setBounds(410, 160, 230, 30);
                prompt_message_jPanel.add(jText03);
//                int ioCodeBit3 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit3();
//                jText03.setText(ioCodeBit3 + "");

                JTextField jText04 = new JTextField();
                jText04.setBounds(410, 210, 230, 30);
                prompt_message_jPanel.add(jText04);
//                int ioCodeBit4 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit4();
//                jText04.setText(ioCodeBit4 + "");

                JTextField jText05 = new JTextField();
                jText05.setBounds(410, 260, 230, 30);
                prompt_message_jPanel.add(jText05);
//                int ioCodeBit5 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit5();
//                jText05.setText(ioCodeBit5 + "");

                JTextField jText06 = new JTextField();
                jText06.setBounds(410, 310, 230, 30);
                prompt_message_jPanel.add(jText06);
//                int ioCodeBit6 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit6();
//                jText06.setText(ioCodeBit6 + "");

                JTextField jText07 = new JTextField();
                jText07.setBounds(410, 360, 230, 30);
                prompt_message_jPanel.add(jText07);
//                int ioCodeBit7 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit7();
//                jText07.setText(ioCodeBit7 + "");

                JTextField jText08 = new JTextField();
                jText08.setBounds(410, 410, 230, 30);
                prompt_message_jPanel.add(jText08);
//                int ioCodeBit8 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit8();
//                jText08.setText(ioCodeBit8 + "");

                JTextField jText09 = new JTextField();
                jText09.setBounds(410, 460, 230, 30);
                prompt_message_jPanel.add(jText09);
//                int ioCodeBit9 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit9();
//                jText09.setText(ioCodeBit9 + "");

                JTextField jText10 = new JTextField();
                jText10.setBounds(410, 510, 230, 30);
                prompt_message_jPanel.add(jText10);
//                int ioCodeBit10 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit10();
//                jText10.setText(ioCodeBit10 + "");

                JTextField jText11 = new JTextField();
                jText11.setBounds(410, 560, 230, 30);
                prompt_message_jPanel.add(jText11);
//                int ioCodeBit11 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit11();
//                jText11.setText(ioCodeBit11 + "");

                JTextField jText12 = new JTextField();
                jText12.setBounds(410, 610, 230, 30);
                prompt_message_jPanel.add(jText12);
//                int ioCodeBit12 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit12();
//                jText12.setText(ioCodeBit12 + "");

                JTextField jText13 = new JTextField();
                jText13.setBounds(410, 660, 230, 30);
                prompt_message_jPanel.add(jText13);
//                int ioCodeBit13 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit13();
//                jText13.setText(ioCodeBit13 + "");

                JTextField jText14 = new JTextField();
                jText14.setBounds(410, 710, 230, 30);
                prompt_message_jPanel.add(jText14);
//                int ioCodeBit14 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit14();
//                jText14.setText(ioCodeBit14 + "");

                JTextField jText15 = new JTextField();
                jText15.setBounds(410, 760, 230, 30);
                prompt_message_jPanel.add(jText15);
//                int ioCodeBit15 = middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().getIoCodeBit15();
//                jText15.setText(ioCodeBit15 + "");

                JButton jButton = new JButton("确定");
                jButton.setBounds(480, 810, 160, 30);
                prompt_message_jPanel.add(jButton);
                jButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        String jtext0 = jText0.getText();
                        String jtext01 = jText01.getText();
                        String jtext02 = jText02.getText();
                        String jtext03 = jText03.getText();
                        String jtext04 = jText04.getText();
                        String jtext05 = jText05.getText();
                        String jtext06 = jText06.getText();
                        String jtext07 = jText07.getText();
                        String jtext08 = jText08.getText();
                        String jtext09 = jText09.getText();
                        String jtext10 = jText10.getText();
                        String jtext11 = jText11.getText();
                        String jtext12 = jText12.getText();
                        String jtext13 = jText13.getText();
                        String jtext14 = jText14.getText();
                        String jtext15 = jText15.getText();
                        motorControlCommand_posi_jTextField1_10.setText(jtext0 + jtext01 + jtext02 + jtext03 + jtext04 + jtext05 + jtext06 + jtext07 + jtext08 + jtext09 + jtext10 + jtext11 + jtext12 + jtext13 + jtext14 + jtext15);
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit0(Integer.parseInt(jtext0));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit1(Integer.parseInt(jtext01));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit2(Integer.parseInt(jtext02));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit3(Integer.parseInt(jtext03));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit4(Integer.parseInt(jtext04));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit5(Integer.parseInt(jtext05));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit6(Integer.parseInt(jtext06));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit7(Integer.parseInt(jtext07));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit8(Integer.parseInt(jtext08));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit9(Integer.parseInt(jtext09));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit10(Integer.parseInt(jtext10));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit11(Integer.parseInt(jtext11));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit12(Integer.parseInt(jtext12));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit13(Integer.parseInt(jtext13));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit14(Integer.parseInt(jtext14));
                        middlewareUtilTwoDemo.statusResponseTwoRobot.getControlDataTwoRobotModel().setIoCodeBit15(Integer.parseInt(jtext15));
                        jFrame.setVisible(false);
                        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }
                });

                jFrame.add(jScrollPane);
                jFrame.setVisible(true);
                jFrame.setBounds(200, 200, 860, 760);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        //
        em_reset_jtext2 = new JTextField();
        em_reset_jtext2.setPreferredSize(new Dimension(240, 30));
        em_reset_jtext2.setFont(font);

        //升降台动作序号
        motorControlCommand_posi_jTextField1_2_robot = new JTextField();
        motorControlCommand_posi_jTextField1_2_robot.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_2_robot.setFont(font);

        //升降台1位置
        motorControlCommand_posi_jTextField1_3_robot = new JTextField();
        motorControlCommand_posi_jTextField1_3_robot.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_3_robot.setFont(font);

        //升降台2位置
        motorControlCommand_posi_jTextField1_4_robot = new JTextField();
        motorControlCommand_posi_jTextField1_4_robot.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_4_robot.setFont(font);

        //机械手X轴动作序号
        motorControlCommand_posi_jTextField1_5_robot = new JTextField();
        motorControlCommand_posi_jTextField1_5_robot.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_5_robot.setFont(font);

        //机械手X轴动作目标位置
        motorControlCommand_posi_jTextField1_6_robot = new JTextField();
        motorControlCommand_posi_jTextField1_6_robot.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_6_robot.setFont(font);

        //IO控制
        motorControlCommand_posi_jTextField1_7_robot = new JTextField();
        motorControlCommand_posi_jTextField1_7_robot.setPreferredSize(new Dimension(240, 30));
        motorControlCommand_posi_jTextField1_7_robot.setFont(font);
//        //移液动作
//        motorControlCommand_posi_jTextField1_8 = new JTextField();
//        motorControlCommand_posi_jTextField1_8.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_8.setFont(font);
//        //多洗多排序号
//        motorControlCommand_posi_jTextField1_9 = new JTextField();
//        motorControlCommand_posi_jTextField1_9.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_9.setFont(font);
//        //液位探测
//        motorControlCommand_posi_jTextField1_10 = new JTextField();
//        motorControlCommand_posi_jTextField1_10.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_10.setFont(font);
//        //移液量
//        motorControlCommand_posi_jTextField1_11 = new JTextField();
//        motorControlCommand_posi_jTextField1_11.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_11.setFont(font);
//
//        //搬运动作序号
//        motorControlCommand_posi_jTextField1_12 = new JTextField();
//        motorControlCommand_posi_jTextField1_12.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_12.setFont(font);
//
//        //搬运目标位置
//        motorControlCommand_posi_jTextField1_13 = new JTextField();
//        motorControlCommand_posi_jTextField1_13.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_13.setFont(font);
//
//        //搬运动作完成后停靠位置
//        motorControlCommand_posi_jTextField1_14 = new JTextField();
//        motorControlCommand_posi_jTextField1_14.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_14.setFont(font);
//
//        //旋盖动作序号
//        motorControlCommand_posi_jTextField1_15 = new JTextField();
//        motorControlCommand_posi_jTextField1_15.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_15.setFont(font);
//
//        //旋盖动作
//        motorControlCommand_posi_jTextField1_16 = new JTextField();
//        motorControlCommand_posi_jTextField1_16.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_16.setFont(font);
//        //扫码开启
//        motorControlCommand_posi_jTextField1_17 = new JTextField();
//        motorControlCommand_posi_jTextField1_17.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_17.setFont(font);
//        //抓管三轴定位序号
//        motorControlCommand_posi_jTextField1_18 = new JTextField();
//        motorControlCommand_posi_jTextField1_18.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_18.setFont(font);
//
//        //抓管三轴定位位置
//        motorControlCommand_posi_jTextField1_19 = new JTextField();
//        motorControlCommand_posi_jTextField1_19.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_19.setFont(font);
//
//        //移液三轴定位序号
//        motorControlCommand_posi_jTextField1_20 = new JTextField();
//        motorControlCommand_posi_jTextField1_20.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_20.setFont(font);
//
//        //移液三轴定位位置
//        motorControlCommand_posi_jTextField1_21 = new JTextField();
//        motorControlCommand_posi_jTextField1_21.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_21.setFont(font);
//        //IO控制
//        motorControlCommand_posi_jTextField1_22 = new JTextField();
//        motorControlCommand_posi_jTextField1_22.setPreferredSize(new Dimension(240, 30));
//        motorControlCommand_posi_jTextField1_22.setFont(font);


        JPanel statusQueryCommand_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel statusQueryCommand_second_jPanel = new JPanel(new BorderLayout());
        JPanel statusQueryCommand_third_jPanel = new JPanel(new BorderLayout());

        JButton statusQueryCommand_jButton = new JButton("状态查询命令");
        statusQueryCommand_jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                middlewareUtilTwoDemo.preworkStationClientThreadTwoDemo.statusRequestINIT();
            }
        });
        myuseless_first_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_first_jPanel.setPreferredSize(new Dimension(80, 30));
        statusQueryCommand_first_jPanel.add(myuseless_first_jPanel);
        statusQueryCommand_first_jPanel.setPreferredSize(new Dimension(850, 28));
        statusQueryCommand_jPanel.add(statusQueryCommand_first_jPanel);


        myuseless_second_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_second_jPanel.setPreferredSize(new Dimension(5, 30));
        myuseless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 10));
        //myuseless_third_jPanel.add(statusQueryCommand_jButton);//状态查询
        myuseless_third_jPanel.add(sendCommand_jButton);//发送控制命令

        statusQueryCommand_jButton.setPreferredSize(new Dimension(220, 30));
        sendCommand_jButton.setPreferredSize(new Dimension(220, 30));
        myuseless_third_jPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(5, 30));
        statusQueryCommand_second_jPanel.add(myuseless_second_jPanel, BorderLayout.WEST);
        statusQueryCommand_second_jPanel.add(myuseless_third_jPanel, BorderLayout.CENTER);
        statusQueryCommand_second_jPanel.add(myuseless_fourth_jPanel, BorderLayout.EAST);
        statusQueryCommand_second_jPanel.setPreferredSize(new Dimension(454, 50));
        send.add(statusQueryCommand_second_jPanel);

        jList_statusres_robot = new JList<>(new String[]{""});
        JScrollPane jScrollPane = new JScrollPane(jList_statusres_robot);
        myuseless_fourth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fourth_jPanel.setPreferredSize(new Dimension(10, 10));
        jScrollPane.setPreferredSize(new Dimension(940, 735));
        statusQueryCommand_third_jPanel.add(jScrollPane);
        select.add(statusQueryCommand_third_jPanel);


        em = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        em.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        em.setPreferredSize(new Dimension(average_width, 48));
        em_emJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        em_sencodJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        em_emJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        em_sencodJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        em_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        em_useJpanel.setPreferredSize(new Dimension(10, 46));
        em_emJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        em_emJpanel.add(em_reset);
        em_emJpanel.add(em_useJpanel);
        em_sencodJpanel.add(em_reset_jtext2);
        em.add(em_emJpanel);
        em.add(em_sencodJpanel);
        //motorControlCommand_secondjPanel.add(first);
        send.add(em);

        //参数查询1
        first = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        first.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        first.setPreferredSize(new Dimension(average_width, 48));
        first_firstJPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        first_secondJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        first_firstJPanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        first_secondJPanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        useless_third_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        useless_third_jPanel.setPreferredSize(new Dimension(10, 46));
        first_firstJPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        first_firstJPanel.add(motorControlCommand_num_jLabel_2);
        first_firstJPanel.add(useless_third_jPanel);
        first_secondJPanel.add(motorControlCommand_posi_jTextField1_2_robot);
        first.add(first_firstJPanel);
        first.add(first_secondJPanel);
        //motorControlCommand_secondjPanel.add(first);
        send.add(first);

        //参数查询2 （two,two_twoJpanel,two_sencodJpanel,two_useJpanel）;
        two = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        two.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        two.setPreferredSize(new Dimension(average_width, 48));
        two_twoJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        two_sencodJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        two_twoJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        two_sencodJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        two_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        two_useJpanel.setPreferredSize(new Dimension(10, 46));
        two_twoJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        two_twoJpanel.add(motorControlCommand_num_jLabel_3);
        two_twoJpanel.add(two_useJpanel);
        two_sencodJpanel.add(motorControlCommand_posi_jTextField1_3_robot);
        two.add(two_twoJpanel);
        two.add(two_sencodJpanel);
        send.add(two);

        //参数查询3 three,three_threeJpanel,three_sencondJpanel,three_useJpanel;
        three = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        three.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        three.setPreferredSize(new Dimension(average_width, 48));
        three_threeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        three_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        three_threeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        three_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        three_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        three_useJpanel.setPreferredSize(new Dimension(10, 46));
        three_threeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        three_threeJpanel.add(motorControlCommand_num_jLabel_4);
        three_threeJpanel.add(three_useJpanel);
        three_sencondJpanel.add(motorControlCommand_posi_jTextField1_4_robot);
        three.add(three_threeJpanel);
        three.add(three_sencondJpanel);
        send.add(three);

        //参数查询4 four,four_fourJpanel,four_sencondJpanel,four_useJpanel;
        four = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        four.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        four.setPreferredSize(new Dimension(average_width, 48));
        four_fourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        four_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        four_fourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        four_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        four_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        four_useJpanel.setPreferredSize(new Dimension(10, 46));
        four_fourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        four_fourJpanel.add(motorControlCommand_num_jLabel_5);
        four_fourJpanel.add(four_useJpanel);
        four_sencondJpanel.add(motorControlCommand_posi_jTextField1_5_robot);
        four.add(four_fourJpanel);
        four.add(four_sencondJpanel);
        send.add(four);

        //参数查询5 five,five_threeJpanel,five_sencondJpanel,five_useJpanel;
        five = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        five.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        five.setPreferredSize(new Dimension(average_width, 48));
        five_threeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        five_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        five_threeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        five_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        five_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        five_useJpanel.setPreferredSize(new Dimension(10, 46));
        five_threeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        five_threeJpanel.add(motorControlCommand_num_jLabel_6);
        five_threeJpanel.add(five_useJpanel);
        five_sencondJpanel.add(motorControlCommand_posi_jTextField1_6_robot);
        five.add(five_threeJpanel);
        five.add(five_sencondJpanel);
        send.add(five);

        //参数查询6 six,six_threeJpanel,six_sencondJpanel,six_useJpanel;
        six = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        six.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        six.setPreferredSize(new Dimension(average_width, 48));
        six_threeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        six_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
        six_threeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
        six_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
        six_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        six_useJpanel.setPreferredSize(new Dimension(10, 46));
        six_threeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        six_threeJpanel.add(motorControlCommand_num_jLabel_7);
        six_threeJpanel.add(six_useJpanel);
        six_sencondJpanel.add(motorControlCommand_posi_jTextField1_7_robot);
        six.add(six_threeJpanel);
        six.add(six_sencondJpanel);
        send.add(six);

//        //参数查询8 eight,eight_eightJpanel,eight_sencondJpanel,eight_useJpanel;
//        eight = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        eight.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        eight.setPreferredSize(new Dimension(average_width, 48));
//        eight_eightJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        eight_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        eight_eightJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        eight_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        eight_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        eight_useJpanel.setPreferredSize(new Dimension(10, 46));
//        eight_eightJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        eight_eightJpanel.add(motorControlCommand_num_jLabel_8);
//        eight_eightJpanel.add(eight_useJpanel);
//        eight_sencondJpanel.add(motorControlCommand_posi_jTextField1_8);
//        eight.add(eight_eightJpanel);
//        eight.add(eight_sencondJpanel);
//        send.add(eight);
//
//        twenty = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twenty.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twenty.setPreferredSize(new Dimension(average_width, 48));
//        twenty_twentyJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twenty_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twenty_twentyJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twenty_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twenty_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twenty_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twenty_twentyJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twenty_twentyJpanel.add(motorControlCommand_num_jLabel_9);
//        twenty_twentyJpanel.add(twenty_useJpanel);
//        twenty_sencondJpanel.add(motorControlCommand_posi_jTextField1_9);
//        twenty.add(twenty_twentyJpanel);
//        twenty.add(twenty_sencondJpanel);
//        send.add(twenty);
//
//        //twentyone,twentyone_twentyoneJpanel,twentyone_sencondJpanel,twentyone_useJpanel;
//        twentyone = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twentyone.setPreferredSize(new Dimension(average_width, 48));
//        twentyone_twentyoneJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twentyone_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twentyone_twentyoneJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twentyone_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twentyone_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyone_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twentyone_twentyoneJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twentyone_twentyoneJpanel.add(motorControlCommand_num_jLabel_10);
//        twentyone_twentyoneJpanel.add(twentyone_useJpanel);
//        twentyone_sencondJpanel.add(motorControlCommand_posi_jTextField1_10);
//        twentyone.add(twentyone_twentyoneJpanel);
//        twentyone.add(twentyone_sencondJpanel);
//        send.add(twentyone);
//
//        //参数查询9 nine,nine_nineJpanel,nine_sencondJpanel,nine_useJpanel;
//        nine = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        nine.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        nine.setPreferredSize(new Dimension(average_width, 48));
//        nine_nineJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        nine_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        nine_nineJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        nine_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        nine_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        nine_useJpanel.setPreferredSize(new Dimension(10, 46));
//        nine_nineJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        nine_nineJpanel.add(motorControlCommand_num_jLabel_11);
//        nine_nineJpanel.add(nine_useJpanel);
//        nine_sencondJpanel.add(motorControlCommand_posi_jTextField1_11);
//        nine.add(nine_nineJpanel);
//        nine.add(nine_sencondJpanel);
//        send.add(nine);
//
//        //ten,ten_tenJpanel,ten_sencondJpanel,ten_useJpanel;
//        ten = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        ten.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        ten.setPreferredSize(new Dimension(average_width, 48));
//        ten_tenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        ten_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        ten_tenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        ten_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        ten_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        ten_useJpanel.setPreferredSize(new Dimension(10, 46));
//        ten_tenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        ten_tenJpanel.add(motorControlCommand_num_jLabel_12);
//        ten_tenJpanel.add(ten_useJpanel);
//        ten_sencondJpanel.add(motorControlCommand_posi_jTextField1_12);
//        ten.add(ten_tenJpanel);
//        ten.add(ten_sencondJpanel);
//        send.add(ten);
//
//        //eleven,eleven_elevenJpanel,eleven_sencondJpanel,eleven_useJpanel;
//        eleven = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        eleven.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        eleven.setPreferredSize(new Dimension(average_width, 48));
//        eleven_elevenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        eleven_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        eleven_elevenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        eleven_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        eleven_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        eleven_useJpanel.setPreferredSize(new Dimension(10, 46));
//        eleven_elevenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        eleven_elevenJpanel.add(motorControlCommand_num_jLabel_13);
//        eleven_elevenJpanel.add(eleven_useJpanel);
//        eleven_sencondJpanel.add(motorControlCommand_posi_jTextField1_13);
//        eleven.add(eleven_elevenJpanel);
//        eleven.add(eleven_sencondJpanel);
//        send.add(eleven);
//
//        //twelve,twelve_twelveJpanel,twelve_sencondJpanel,twelve_useJpanel;
//        twelve = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twelve.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twelve.setPreferredSize(new Dimension(average_width, 48));
//        twelve_twelveJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twelve_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twelve_twelveJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twelve_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twelve_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twelve_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twelve_twelveJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twelve_twelveJpanel.add(motorControlCommand_num_jLabel_14);
//        twelve_twelveJpanel.add(twelve_useJpanel);
//        twelve_sencondJpanel.add(motorControlCommand_posi_jTextField1_14);
//        twelve.add(twelve_twelveJpanel);
//        twelve.add(twelve_sencondJpanel);
//        send.add(twelve);
//
//        //thirteen,thirteen_thirteenJpanel,thirteen_sencondJpanel,thirteen_useJpanel;
//        thirteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        thirteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        thirteen.setPreferredSize(new Dimension(average_width, 48));
//        thirteen_thirteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        thirteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        thirteen_thirteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        thirteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        thirteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        thirteen_useJpanel.setPreferredSize(new Dimension(10, 46));
//        thirteen_thirteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        thirteen_thirteenJpanel.add(motorControlCommand_num_jLabel_15);
//        thirteen_thirteenJpanel.add(thirteen_useJpanel);
//        thirteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_15);
//        thirteen.add(thirteen_thirteenJpanel);
//        thirteen.add(thirteen_sencondJpanel);
//        send.add(thirteen);
//
//        //fourteen,fourteen_fourteenJpanel,fourteen_sencondJpanel,fourteen_useJpanel;
//        fourteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        fourteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        fourteen.setPreferredSize(new Dimension(average_width, 48));
//        fourteen_fourteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        fourteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        fourteen_fourteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        fourteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        fourteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        fourteen_useJpanel.setPreferredSize(new Dimension(10, 46));
//        fourteen_fourteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        fourteen_fourteenJpanel.add(motorControlCommand_num_jLabel_16);
//        fourteen_fourteenJpanel.add(fourteen_useJpanel);
//        fourteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_16);
//        fourteen.add(fourteen_fourteenJpanel);
//        fourteen.add(fourteen_sencondJpanel);
//        send.add(fourteen);
//
//        fourteenone = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        fourteenone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        fourteenone.setPreferredSize(new Dimension(average_width, 48));
//        fourteenone_fourteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        fourteenone_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        fourteenone_fourteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        fourteenone_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        fourteenone_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        fourteenone_useJpanel.setPreferredSize(new Dimension(10, 46));
//        fourteenone_fourteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        fourteenone_fourteenJpanel.add(motorControlCommand_num_jLabel_17);
//        fourteenone_fourteenJpanel.add(fourteenone_useJpanel);
//        fourteenone_sencondJpanel.add(motorControlCommand_posi_jTextField1_17);
//        fourteenone.add(fourteenone_fourteenJpanel);
//        fourteenone.add(fourteenone_sencondJpanel);
//        send.add(fourteenone);
//
//        //fifteen,fifteen_fifteenJpanel,fifteen_sencondJpanel,fifteen_useJpanel;
//        fifteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        fifteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        fifteen.setPreferredSize(new Dimension(average_width, 48));
//        fifteen_fifteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        fifteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        fifteen_fifteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        fifteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        fifteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        fifteen_useJpanel.setPreferredSize(new Dimension(10, 46));
//        fifteen_fifteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        fifteen_fifteenJpanel.add(motorControlCommand_num_jLabel_18);
//        fifteen_fifteenJpanel.add(fifteen_useJpanel);
//        fifteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_18);
//        fifteen.add(fifteen_fifteenJpanel);
//        fifteen.add(fifteen_sencondJpanel);
//        send.add(fifteen);
//
//        //sixteen,sixteen_sixteenJpanel,sixteen_sencondJpanel,sixteen_useJpanel;
//        sixteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        sixteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        sixteen.setPreferredSize(new Dimension(average_width, 48));
//        sixteen_sixteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        sixteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        sixteen_sixteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        sixteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        sixteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        sixteen_useJpanel.setPreferredSize(new Dimension(10, 46));
//        sixteen_sixteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        sixteen_sixteenJpanel.add(motorControlCommand_num_jLabel_19);
//        sixteen_sixteenJpanel.add(sixteen_useJpanel);
//        sixteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_19);
//        sixteen.add(sixteen_sixteenJpanel);
//        sixteen.add(sixteen_sencondJpanel);
//        send.add(sixteen);
//
//        //seventeen,seventeen_seventeenJpanel,seventeen_sencondJpanel,seventeen_useJpanel;
//        seventeen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        seventeen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        seventeen.setPreferredSize(new Dimension(average_width, 48));
//        seventeen_seventeenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        seventeen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        seventeen_seventeenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        seventeen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        seventeen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        seventeen_useJpanel.setPreferredSize(new Dimension(10, 46));
//        seventeen_seventeenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        seventeen_seventeenJpanel.add(motorControlCommand_num_jLabel_20);
//        seventeen_seventeenJpanel.add(seventeen_useJpanel);
//        seventeen_sencondJpanel.add(motorControlCommand_posi_jTextField1_20);
//        seventeen.add(seventeen_seventeenJpanel);
//        seventeen.add(seventeen_sencondJpanel);
//        send.add(seventeen);
//
//        //eighteen,eighteen_eighteenJpanel,eighteen_sencondJpanel,eighteen_useJpanel;
//        eighteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        eighteen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        eighteen.setPreferredSize(new Dimension(average_width, 48));
//        eighteen_eighteenJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        eighteen_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        eighteen_eighteenJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        eighteen_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        eighteen_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        eighteen_useJpanel.setPreferredSize(new Dimension(10, 46));
//        eighteen_eighteenJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        eighteen_eighteenJpanel.add(motorControlCommand_num_jLabel_21);
//        eighteen_eighteenJpanel.add(eighteen_useJpanel);
//        eighteen_sencondJpanel.add(motorControlCommand_posi_jTextField1_21);
//        eighteen.add(eighteen_eighteenJpanel);
//        eighteen.add(eighteen_sencondJpanel);
//        send.add(eighteen);
//
//        twentytwo = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentytwo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twentytwo.setPreferredSize(new Dimension(average_width, 48));
//        twentytwo_twentytwoJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twentytwo_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twentytwo_twentytwoJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twentytwo_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twentytwo_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentytwo_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twentytwo_twentytwoJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twentytwo_twentytwoJpanel.add(motorControlCommand_num_jLabel_22);
//        twentytwo_twentytwoJpanel.add(twentytwo_useJpanel);
//        twentytwo_sencondJpanel.add(motorControlCommand_posi_jTextField1_22);
//        twentytwo.add(twentytwo_twentytwoJpanel);
//        twentytwo.add(twentytwo_sencondJpanel);
//        send.add(twentytwo);

//        twentythree = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentythree.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twentythree.setPreferredSize(new Dimension(average_width, 48));
//        twentythree_twentythreeJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twentythree_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twentythree_twentythreeJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twentythree_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twentythree_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentythree_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twentythree_twentythreeJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twentythree_twentythreeJpanel.add(motorControlCommand_num_jLabel_21);
//        twentythree_twentythreeJpanel.add(twentythree_useJpanel);
//        twentythree_sencondJpanel.add(motorControlCommand_posi_jTextField1_21);
//        twentythree.add(twentythree_twentythreeJpanel);
//        twentythree.add(twentythree_sencondJpanel);
//        send.add(twentythree);

//        twentyfour = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        twentyfour.setPreferredSize(new Dimension(average_width, 48));
//        twentyfour_twentyfourJpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
//        twentyfour_sencondJpanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 7));
//        twentyfour_twentyfourJpanel.setPreferredSize(new Dimension((int) (average_width * 0.4 - 2), 46));
//        twentyfour_sencondJpanel.setPreferredSize(new Dimension((int) (average_width * 0.6), 46));
//        twentyfour_useJpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        twentyfour_useJpanel.setPreferredSize(new Dimension(10, 46));
//        twentyfour_twentyfourJpanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
//        twentyfour_twentyfourJpanel.add(motorControlCommand_num_jLabel_22);
//        twentyfour_twentyfourJpanel.add(twentyfour_useJpanel);
//        twentyfour_sencondJpanel.add(motorControlCommand_posi_jTextField1_22);
//        twentyfour.add(twentyfour_twentyfourJpanel);
//        twentyfour.add(twentyfour_sencondJpanel);
//        send.add(twentyfour);

        statusQueryCommand_jPanel.setPreferredSize(new Dimension(850, 80));
        myuseless_fifth_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_fifth_jPanel.setPreferredSize(new Dimension(80, 30));

        myuseless_seventh_jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        myuseless_seventh_jPanel.setPreferredSize(new Dimension(121, 30));
        return mainPanel;
    }
}
