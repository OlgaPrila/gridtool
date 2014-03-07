package define;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import com.sun.jndi.ldap.LdapURL;
import define.TaskThread.TaskThread;
import java.awt.Frame;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import nordugrid.arc.*;
//import net.sf.access.api.*;
//import net.sf.access.api.arc.ARCFacade;
/*
 * NewJFrame.java
 *
 * Created on 27.10.2011, 21:10:17
 */

/**
 *
 * @author alex
 */
public class NewJFrame extends javax.swing.JFrame {

    private File fileExe = null;
    private String exeString = null;
    private File fileArg = null;
    private String argString = null;
    private URL submitted = null;
    private File file = null;
    private String envVar = "";
    private Object qw;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GridProject");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setText("Результат выполнения программы");

        jButton1.setText("Выполнить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Выполняемый файл");

        jLabel2.setText("Задание");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Список кластеров"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTable1.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.getColumnModel().getColumn(0).setResizable(false);

        jButton2.setText("open");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("на екран");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(10);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(5);
        jTextArea1.setMinimumSize(new java.awt.Dimension(0, 10));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(15);
        jTextArea2.setRows(1);
        jTextArea2.setText("hello.sh");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setMinimumSize(new java.awt.Dimension(0, 18));
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setColumns(15);
        jTextArea3.setRows(1);
        jTextArea3.setText("/home/olga/gradtest/hellogrid.xsrl");
        jTextArea3.setName(""); // NOI18N
        jScrollPane4.setViewportView(jTextArea3);

        jButton4.setText("Проверить состояние задачи");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Загрузить результат");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Создать XRSL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setText("Путь к результату");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("/home/olga/loading/");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea4);

        jMenu1.setText("Открыть");

        jMenuItem1.setText("Открыть выполняемый файл");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Открыть задание");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5))
                .addGap(12, 12, 12)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.loadLibrary("jarc");
        envVar = System.getenv("HOME");

        if (!(new File("/tmp/x509up_u1000").exists())) {
            return;
        } /*else {
            try {
                String s = envVar + "/test.sh ";
                Runtime.getRuntime().exec(s + "NfHfRfYbOt_[f[f!!");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        // Setup logging.
        // Possible log-levels: FATAL, ERROR, WARNING, INFO, VERBOSE and DEBUG.
        new Logger(Logger.getRootLogger(), "arcsub");
        Logger.getRootLogger().addDestination(new LogStream_ostream(arc.getStdout()));
        Logger.getRootLogger().setThreshold(LogLevel.DEBUG);

        // Initialise the UserConfig object.
        // This object holds various attributes, including proxy location and selected services.
        UserConfig usercfg = new UserConfig("");
        //create application, than must be running in task 
        
        ApplicationType app = new ApplicationType();
        app.setOutput("std.out");
        app.setError("stderr.out");

        // Set the executable script
        ExecutableType exe = new ExecutableType();
        exe.setPath(jTextArea2.getText());
        System.out.println(exe.getPath());
        
        // Set arguments to the executable.
        StringList arguments = new StringList();
        arguments.add("qwerty");
        exe.setArgument(arguments);
        app.setExecutable(exe);
        
        // Create job description.
        JobDescription job = new JobDescription();
        job.setApplication(app);
        // Create ComputingServiceRetriever.
        ComputingServiceRetriever serviceRetriv = new ComputingServiceRetriever(usercfg);    
        
        //Endpoint enn2 = new Endpoint("uagrid.org.ua", Endpoint.CapabilityEnum.COMPUTINGINFO);
        //Endpoint enn3 = new Endpoint("energrid.kiev.ua", Endpoint.CapabilityEnum.COMPUTINGINFO);
        //Endpoint enn4 = new Endpoint("cluster.immsp.kiev.ua", Endpoint.CapabilityEnum.COMPUTINGINFO);
        //Endpoint enn5 = new Endpoint("ng.grid.fcss.ukma.kiev.ua", Endpoint.CapabilityEnum.COMPUTINGINFO);
        //Endpoint enn6 = new Endpoint("arc-edu.hpcc.kpi.ua", Endpoint.CapabilityEnum.COMPUTINGINFO);
       // Endpoint enn = new Endpoint("arc.imbg.org.ua", Endpoint.CapabilityEnum.COMPUTINGINFO);
      //   Endpoint enn7  = new Endpoint("grid.isma.kharkov.ua:60443/arex", Endpoint.CapabilityEnum.COMPUTINGINFO);
         Endpoint enn8  = new Endpoint("grid.stu.cn.ua:60000/arex", Endpoint.CapabilityEnum.COMPUTINGINFO);
         
         
        //add clasters to queue
      /*  serviceRetriv.addEndpoint(enn);
        serviceRetriv.addEndpoint(enn2);
        serviceRetriv.addEndpoint(enn3);
        serviceRetriv.addEndpoint(enn4);
        serviceRetriv.addEndpoint(enn5);
        serviceRetriv.addEndpoint(enn6);*/
       // serviceRetriv.addEndpoint(enn7);
        serviceRetriv.addEndpoint(enn8); 
        
        serviceRetriv._wait();
        ExecutionTargetList targets = new ExecutionTargetList();
        serviceRetriv.GetExecutionTargets(targets);
        JobSupervisor jobSVisor = new JobSupervisor(usercfg);
        //Go through all the possible execution target to launch the task

        for (ExecutionTargetListIteratorHandler it = new ExecutionTargetListIteratorHandler(targets.begin()); !it.equal(targets.end()); it.next()) {
            //the handle to the task
            Job jobTmp = new Job();
            
            if (it.pointer().Submit(usercfg, job, jobTmp)){
                //add handle task to jobSupervisor to track the progress of a task
                jobSVisor.AddJob(jobTmp);
                JobList ls =  new JobList();
                ls.add(jobTmp);
                //write handle task to track the progress of a task with arcstat in console
                Job.WriteJobsToFile(envVar+"/.arc/jobs.xml", ls);
                jTextArea1.append("Job is started with id\n"+jobTmp.getJobID().plainstr()+"\n");
                TaskThread threadd = new TaskThread(jobSVisor, jobTmp, this, envVar,usercfg);
                threadd.start();      
                
                break;
                // If successful write job id.
            } else {
                jTextField1.setText("Неудается подключится к: " );
                System.out.print(jobTmp.getError());
            }
        }
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //jTable1.getModel().setValueAt("arc.bitp.kiev.ua", 0, 0);
        //добавить больше кластеров
        jTable1.getModel().setValueAt("grid.stu.cn.ua:60000/arex", 0, 0);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            /*
             * DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             * model.addRow(new Object[]{""}); jTable1.setModel(model);
             * jTable1.editCellAt(jTable1.getModel().getRowCount(),
             * jTable1.getModel().getColumnCount());
             */


            Vector idx = new Vector(); //смещение в главном файле
            Vector clusters = new Vector();//вектор кластеров
            Vector freeProcessors = new Vector();//вектор свободных процессоров
            Vector nodes = new Vector();//вектор с вычислительными узлами
            Vector spaceFree = new Vector();//вектор свободного дискового пространства

            //формируем вектор с позициями начала строк в файле инфы
            RandomAccessFile f = new RandomAccessFile("/home/alex/grid/my.list", "rw");
            long dataPointer = 0;
            idx.addElement(new Long(dataPointer));
            if (f != null) {
                while (f.readLine() != null) {
                    dataPointer = f.getFilePointer();
                    idx.addElement(new Long(dataPointer));
                }
            }

//##################################################           
            //формируем вектор с кластерами
            dataPointer = (long) ((Long) idx.elementAt(0)).doubleValue();
            f.seek(dataPointer);
            String s = "";
            while (s != null) {
                s = f.readLine();
                if (s != null) {
                    if (s.contains("ÐÐ»Ð°ÑÑÐµÑ")) {//Кластер
                        String substr = s.substring(15);
                        clusters.add(substr);
                    }
                }
            }

//##################################################
            //формируем вектор со всеми процессорами
            Vector allProcessors = new Vector();
            dataPointer = (long) ((Long) idx.elementAt(0)).doubleValue();
            f.seek(dataPointer);
            s = "";
            int i = 0;
            while (s != null) {
                i++;
                s = f.readLine();
                if (s != null) {
                    if (s.contains("  ÐÑÐ¾ÑÐµÑÑÐ¾ÑÑ, Ð·Ð°Ð½ÑÑÑÐµ:")) {//  Процессоры, занятые:
                        i = i - 2;
                        dataPointer = (long) ((Long) idx.elementAt(i)).doubleValue();
                        f.seek(dataPointer);
                        s = f.readLine();
                        String substr = s.substring(36);
                        allProcessors.add(new Long(substr));
                        s = f.readLine();
                        i = i + 2;
                    }
                }
            }

            //формируем вектор с занятыми процессорами
            Vector busyProcessors = new Vector();
            dataPointer = (long) ((Long) idx.elementAt(0)).doubleValue();
            f.seek(dataPointer);
            s = "";
            while (s != null) {
                s = f.readLine();
                if (s != null) {
                    if (s.contains("  ÐÑÐ¾ÑÐµÑÑÐ¾ÑÑ, Ð·Ð°Ð½ÑÑÑÐµ:")) {//  Процессоры, занятые:
                        String substr = s.substring(40);
                        busyProcessors.add(new Long(substr));
                    }
                }
            }

            //формируем вектор с свободными процессорами
            for (int j = 0; j < busyProcessors.size(); j++) {
                Long lon = (Long) allProcessors.get(j) - (Long) busyProcessors.get(j);
                if (lon < 0) {
                    lon *= -1;
                }
                freeProcessors.add(lon);
            }

//##################################################            
            //формируем вектор с вычислительными узлами
            dataPointer = (long) ((Long) idx.elementAt(0)).doubleValue();
            f.seek(dataPointer);
            s = "";
            i = 0;
            while (s != null) {
                s = f.readLine();
                if (s != null) {
                    if (s.contains("  ÐÑÑÐ¸ÑÐ»Ð¸ÑÐµÐ»ÑÐ½ÑÐµ ÑÐ·Ð»Ñ:")) {//  Вычислительные узлы:
                        i++;
                        s = f.readLine();
                        String substr = s.substring(4, 6);
                        Long in = new Long(substr.trim());
                        nodes.add(in);
                    }
                }
            }

            //##################################################           
            //формируем вектор с допустимой дисковой памятью
            dataPointer = (long) ((Long) idx.elementAt(0)).doubleValue();
            f.seek(dataPointer);
            s = "";
            i = 0;
            while (s != null) {
                i++;
                s = f.readLine();
                if (s != null) {
                    if (s.contains("  ÐÑÐ¾ÑÐµÑÑÐ¾ÑÑ, Ð·Ð°Ð½ÑÑÑÐµ:")) {//  Процессоры, занятые:
                        i = i - 3;
                        dataPointer = (long) ((Long) idx.elementAt(i)).doubleValue();
                        f.seek(dataPointer);
                        s = f.readLine();
                        if (s.contains("  ÐÐ¸ÑÐº, Ð´Ð¾ÑÑÑÐ¿Ð½Ð¾:")) {//  Диск, доступно: 
                            i = i + 3;
                        } else {
                            i = i - 2;
                            dataPointer = (long) ((Long) idx.elementAt(i)).doubleValue();
                            f.seek(dataPointer);
                            s = f.readLine();
                            i = i + 6;
                        }
                        dataPointer = (long) ((Long) idx.elementAt(i)).doubleValue();
                        f.seek(dataPointer);
                        String substr = s.substring(30);

                        int k = 30;
                        char c[] = substr.toCharArray();
                        for (int j = 0; j < substr.length(); j++) {
                            if (c[j] == ' ') {
                                break;
                            }
                            k++;
                        }
                        String subsubstr = s.substring(30, k);
                        spaceFree.add(new Long(subsubstr.trim()));
                    }
                }
            }


//##################################################    
            //формируем окончательный список кластеров
            long longfreeProcessors = 10;
            long longnodes = 10;
            long longspaceFree = 2000000000;
            Vector clusterfin = new Vector();
            for (int j = 0; j < clusters.size(); j++) {
                clusterfin.add(clusters.get(j));
            }

            for (int j = 0; j < freeProcessors.size(); j++) {
                if ((Long) freeProcessors.get(j) < longfreeProcessors) {
                    clusterfin.setElementAt(null, j);
                }
            }
            for (int j = 0; j < nodes.size(); j++) {
                if ((Long) nodes.get(j) < longnodes) {
                    clusterfin.setElementAt(null, j);
                }
            }
            for (int j = 0; j < spaceFree.size(); j++) {
                if ((Long) spaceFree.get(j) < longspaceFree) {
                    clusterfin.setElementAt(null, j);
                }
            }
            //jTextArea1.append(s);
            for (int j = 0; j < clusters.size(); j++) {
                if (clusterfin.get(j) != null) {
                    jTextArea1.append(clusterfin.get(j).toString());
                    jTextArea1.append("\n");
                }
            }

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*
         * int sel = -1; sel = jTable1.getSelectedRow(); // или номер строки if
         * (sel == -1) { //custom title, error icon
         * JOptionPane.showMessageDialog(new Frame(), "Не выбран кластер",
         * "Ошибка", JOptionPane.ERROR_MESSAGE); } else { DefaultTableModel
         * model = (DefaultTableModel) jTable1.getModel(); model.removeRow(sel);
         * jTable1.setModel(model); }
         */
        String seq = submitted.Path().toString();
        CharSequence res = seq.subSequence(6, seq.length());
        String s = "/tmp/loading/" + res.toString() + "/std.out";
        //String s = envVar+"/"+seq.subSequence(6, seq.length());
        File fileTask = new File(s.toString());
        FileReader fr2 = null;
        try {
            fr2 = new FileReader(fileTask.getAbsolutePath());


        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br2 = new BufferedReader(fr2);
        StringBuilder sb2 = new StringBuilder();
        String eachLine2 = null;
        try {
            eachLine2 = br2.readLine();


        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (eachLine2 != null) {
            sb2.append(eachLine2);
            sb2.append("\n");
            try {
                eachLine2 = br2.readLine();


            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jTextArea1.append(sb2.toString());
        jTextArea1.append("\n");
        //file.delete();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(true);
        if (fc.showOpenDialog(jFileChooser1) == JFileChooser.APPROVE_OPTION) {
            fileExe = fc.getSelectedFile();
            jTextArea2.setText(fileExe.getAbsolutePath());

            try {
                //Действие, которое необходимо произвести с файлом, например, просмотр в TextArea
                //jTextArea2.read( new FileReader(fileExe.getAbsolutePath() ), null );
                FileReader fr = new FileReader(fileExe.getAbsolutePath());
                BufferedReader br = new BufferedReader(fr);

                StringBuilder sb = new StringBuilder();
                String eachLine = br.readLine();

                while (eachLine != null) {
                    sb.append(eachLine);
                    sb.append("\n");
                    eachLine = br.readLine();
                }
                exeString = sb.toString();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(new Frame(), "Проблемы с правами на файл",
                        "Ошибка " + fileExe.getAbsolutePath(), JOptionPane.ERROR_MESSAGE);
                //System.out.println("problem accessing file"+fileExe.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(true);
        MyFileFilter ff = new MyFileFilter();
        fc.setFileFilter(ff);
        if (fc.showOpenDialog(jFileChooser1) == JFileChooser.APPROVE_OPTION) {
            fileArg = fc.getSelectedFile();
            jTextArea3.setText(fileArg.getAbsolutePath());

            try {
                //Действие, которое необходимо произвести с файлом, например, просмотр в TextArea
                //jTextArea2.read( new FileReader(fileExe.getAbsolutePath() ), null );
                FileReader fr = new FileReader(fileArg.getAbsolutePath());
                BufferedReader br = new BufferedReader(fr);

                StringBuilder sb = new StringBuilder();
                String eachLine = br.readLine();

                while (eachLine != null) {
                    sb.append(eachLine);
                    sb.append("\n");
                    eachLine = br.readLine();
                }
                argString = sb.toString();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(new Frame(), "Проблемы с правами на файл",
                        "Ошибка " + fileArg.getAbsolutePath(), JOptionPane.ERROR_MESSAGE);
                //System.out.println("problem accessing file"+fileExe.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FileReader fr = null;
        String seq = submitted.Path().toString();
        String s = "/tmp/" + seq.subSequence(6, seq.length()).toString();
        file = new File(s);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            String ss = envVar + "/testConn.sh ";
            try {
                Runtime.getRuntime().exec(ss + submitted.fullstr() + " " + s);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            fr = new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String eachLine = br.readLine();
            int i = 0;
            while (eachLine != null) {
                sb.append(eachLine);
                sb.append("\n");
                eachLine = br.readLine();
                i++;
            }
            if (i != 0) {
                JOptionPane.showMessageDialog(new Frame(), sb.toString(),
                        "Сообщение", JOptionPane.INFORMATION_MESSAGE);
            }

            //jTextArea1.append(sb.toString());
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Создание временного каталога для скачивания задачи
        try {
            File dir = new File("/tmp/loading");
            if (!dir.exists()) {
                boolean mkdir = dir.mkdir();
                if (!mkdir) {
                    JOptionPane.showMessageDialog(new Frame(), "Директория для скачивания файла не создана",
                            "Предупреждение", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FileReader fr = null;
        try {
            
            fr = new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String eachLine = br.readLine();
            while (eachLine != null) {
                sb.append(eachLine);
                sb.append("\n");
                eachLine = br.readLine();
            }
            String find = sb.toString();
            if (find.contains("FINISHED")) {
                String ss = envVar + "/loadTask";
                try {
                    Runtime.getRuntime().exec(ss + submitted.fullstr());


                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*
                 *
                 */
            } else {
                JOptionPane.showMessageDialog(new Frame(), "Файл еще не выполнен!",
                        "Предупреждение", JOptionPane.WARNING_MESSAGE);


            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();


            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int shift = 0;
        String nameXrsl = "/tmp/xrsl";
        Date datetime = new Date();
        DateFormat dateformat = new SimpleDateFormat("yyMMddHHmmss");
        while (new File(nameXrsl + dateformat.format(datetime) + Integer.toString(shift) + ".xrsl").exists()) {
            shift++;
        }
        File f = new File(nameXrsl + dateformat.format(datetime) + Integer.toString(shift) + ".xrsl");
        try {
            f.createNewFile();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(f.getAbsolutePath());


        String xrslContent = null;

        String executable = jTextArea2.getText();
        String inputFiles = jTextArea2.getText();
        String stdout = "out.txt";
        String stderr = "err.txt";
        String jobName = "jobName";
        String cputime = "5";
        String disk = "500";
        String cache = "yes";
        String ftpThreads = "4";

        xrslContent = "&\n";
        xrslContent += "(executable=" + executable + ")\n";
        xrslContent += "(inputFiles=(" + inputFiles + " \"\"))\n";
        xrslContent += "(stdout=\"" + stdout + "\")\n";
        xrslContent += "(stderr=\"" + stderr + "\")\n";
        xrslContent += "(outputFiles=(\"" + stdout + "\" \"\")(\"" + stderr + "\" \"\"))\n";
        xrslContent += "(jobName=" + jobName + ")\n";
        xrslContent += "(cputime=" + cputime + ")\n";
        xrslContent += "(disk=\"" + disk + "\")\n";
        xrslContent += "(cache=\"" + cache + "\")\n";
        xrslContent += "(ftpThreads=\"" + ftpThreads + "\")\n";

        try {
            FileWriter os = new FileWriter(f.getAbsolutePath());
            os.write(xrslContent);
            os.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    public JTextArea getJTextArea1(){
        return jTextArea1;
    }
    
    public JTextArea getJtextArea4(){
        return jTextArea4;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
