/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package define.TaskThread;
import define.NewJFrame;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import nordugrid.arc.*;
import java.lang.String;
import javax.naming.spi.DirectoryManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author mustang
 */
public class TaskThread extends Thread{
    private JobSupervisor jobVisor;
    private Job jobbi;
    private NewJFrame frame;
    private JTextArea textArea;
    private String envVar;
    private UserConfig usrConf;
    
    public TaskThread(JobSupervisor visor, Job jb, NewJFrame fr, String envString, UserConfig usrC){
        this.jobVisor = visor;
        this.jobbi = jb;
        this.frame = fr;
        this.textArea = frame.getJTextArea1();
        this.envVar = envString;
        this.usrConf = usrC;
    }

    @Override
    public void run(){
        boolean ok = false;
        
        while (!ok){
            this.jobVisor.Update();
            JobList j = this.jobVisor.GetAllJobs();
            for (JobListIteratorHandler it1 = new JobListIteratorHandler(j.begin()); !it1.equal(j.end()); it1.next()) {
                /*
                System.out.println(it1.pointer().getState().GetGeneralState());
                if (it1.pointer().getState().GetGeneralState()=="Failed"){
                    System.out.println(it1.pointer().getStdOut());
                    System.out.println(it1.pointer().getStdErr());
                    StringList ls = it1.pointer().getOtherMessages();
                    StringListIteratorHandler st = new StringListIteratorHandler(ls.begin());
                    for (;!st.equal(ls.end());st.next()) {
                        System.out.println("otherMes");
                        System.out.println(st.pointer().toString());
                    }
                    ls = it1.pointer().getExecutionNode();
                    st = new StringListIteratorHandler(ls.begin());
                    for (;!st.equal(ls.end());st.next()) {
                        System.out.println("otherMes");
                        System.out.println(st.pointer().toString());
                    }
                   
                    ls = it1.pointer().getError();
                    st = new StringListIteratorHandler(ls.begin());
                    for (;!st.equal(ls.end());st.next()) {
                        System.out.println("otherMes");
                        System.out.println(st.pointer().toString());
                    }
                    System.out.println(it1.pointer().getExitCode());

                }*/
                if (it1.pointer().getState().GetGeneralState().equals("Finishing")){
                    ok = true;
                    System.out.println("exit");
                    getResult(it1.pointer());
                }
            }
            try {        
                sleep(20000);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(TaskThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void getResult(Job job1){
       
        //Создание временного каталога для скачивания задачи
        boolean mkdir ; 
        try {
            File dir = new File(frame.getJtextArea4().getText());
            if (!dir.exists()) {
                mkdir = dir.mkdir();
                if (!mkdir) {
                    frame.getJTextArea1().append("Error destination folder is not exist and can not be created");
                    return ;
                }
            }
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        //System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        String ss = envVar + "/loadTask.sh ";
        URL urll = new URL(frame.getJtextArea4().getText());
        job1.Retrieve(this.usrConf, urll, true);
        frame.getJTextArea1().append("Результат выполнения задания помещен в папку "+frame.getJtextArea4().getText()+"\n");
       
        /*try {
            Runtime.getRuntime().exec(ss + envVar +"/loadding " + jobbi.getJobID().plainstr());
            textArea.append("The result of the task is loaded into the folder home/user/loading/\n");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            textArea.append("Results of the task could not load");
        }    */
    }
}
