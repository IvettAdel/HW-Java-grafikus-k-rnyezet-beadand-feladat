import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame {
    Frame1(){
        super("Kor_terulet");
        initComponent();
    }

    private void initComponent(){

        this.setLocationRelativeTo(null);
        this.setSize(300,150);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel TextLbl = new JLabel("Sugar:");
        TextLbl.setBounds(50,20,50,30);
        this.add(TextLbl);

        
        JTextField radiusTf = new JTextField();
        radiusTf.setBounds(100,20,150,30);
        this.add(radiusTf);

        JLabel resultLbl = new JLabel();
        resultLbl.setBounds(100,80,200,30);
        this.add(resultLbl);
        
        JButton calcBtn = new JButton("Szamit");
        calcBtn.setBounds(100,50,150,30);    
        this.add(calcBtn);
        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int userInput = Integer.parseInt(radiusTf.getText());
                Control calculator = new Control();
                double ered = calculator.calc(userInput);
                resultLbl.setText(String.valueOf(ered));
                radiusTf.setText("");

            };
            
        });
    }

   
}

