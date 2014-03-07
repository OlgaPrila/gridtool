package define;


import java.io.File;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
class MyFileFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Разрешить только каталоги или файлы с расширением TXT
            return file.isDirectory() || file.getAbsolutePath().endsWith(".xrsl");
        }
        @Override
        public String getDescription() {
            // Это описание будет отображаться в диалоговом окне,
            // жестко запрограмированно = некрасиво, следует использовать интернационализацию
            return "Задания (*.xrsl)";
        }
    }
