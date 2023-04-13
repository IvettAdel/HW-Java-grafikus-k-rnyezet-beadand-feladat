import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Frame extends JFrame {

    Frame(){
        super("Kör terület");
        initComponent();
    }

    private void initComponent(){


        this.setSize(300,150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        


        JLabel TextLbl = new JLabel("Sugár:");
        TextLbl.setBounds(50,20,50,30);
        this.add(TextLbl);

        
        JTextField radiusTf = new JTextField();
        radiusTf.setBounds(100,20,150,30);
        this.add(radiusTf);

        JLabel resultLbl = new JLabel();
        resultLbl.setBounds(100,80,200,30);
        this.add(resultLbl);
        
        JButton calcBtn = new JButton("Számít");
        calcBtn.setBounds(100,50,150,30);    
        this.add(calcBtn);
        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int userInput = Integer.parseInt(radiusTf.getText());
                FormControl calculator = new FormControl();
                double ered = calculator.calc(userInput);
                resultLbl.setText(String.valueOf(ered));
                radiusTf.setText("");

            };
            
        });
    }

   
}

