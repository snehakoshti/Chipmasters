/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.awt.EventQueue;
import java.util.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Happy
 */
public class comboxdevice extends KeyAdapter {
    private final JComboBox<String> comboBox;
    private final List<String> list = new ArrayList<>() ;
    private boolean shouldHide;
    public comboxdevice(JComboBox<String> combo)
    {
      super();
      this.comboBox=combo;
      for(int i=0;i<comboBox.getModel().getSize();i++)
      {
          list.add(comboBox.getItemAt(i));
          
       }
    }
    private static void setSuggestionModel(JComboBox<String>comboBox, ComboBoxModel<String> cml, String str)
    {
          comboBox.setModel((ComboBoxModel<String>) cml);
        comboBox.setSelectedIndex(-1);
        ((JTextField)comboBox.getEditor().getEditorComponent()).setText(str);
    }
    private static ComboBoxModel<String> getSuggestionModel(List<String> list, String text)
    {
        DefaultComboBoxModel<String> m=new DefaultComboBoxModel<>();
        for(String s:list)
        {
            if(s.startsWith(text))
                m.addElement(s);
        }
        return m;
    }
    
    @Override public void keyTyped(final KeyEvent e) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                String text =((JTextField) e.getComponent()).getText();
                ComboBoxModel<String> m;
                if(text.isEmpty()){
                    String[] array = list.toArray(new String[list.size()]);
                    m = new DefaultComboBoxModel<String>(array);
                    setSuggestionModel(comboBox,m, "");
                    comboBox.hidePopup();
                    
                }
                else
                {
                    m=getSuggestionModel(list, text);
                    if(m.getSize() == 0 || shouldHide)
                    {
                        comboBox.hidePopup();
                     }
                    else
                    {
                        setSuggestionModel(comboBox, m, text);
                        comboBox.showPopup();
                    }
            }
          }  
        });
    }
    
}
