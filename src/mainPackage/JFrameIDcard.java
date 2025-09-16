package mainPackage;

import javax.swing.*;
import java.awt.*;

public class JFrameIDcard {




    static public void idFrameGen () {


        //-----------------------Frame declaration--------------------------

        JFrame idFrame = new JFrame("ID card :");


        //-----------------------Frame utility-------------------------------

        idFrame.setLocationRelativeTo(null);
        idFrame.isAlwaysOnTop();
        idFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //-----------------------frame properties---------------------------

        idFrame.setSize(400,250);


        //-----------------------creates a panel and sets the layout---------

        JPanel panel = new JPanel(new GridBagLayout());


        // needed to index positions and add 'padding'
        GridBagConstraints gbc = new GridBagConstraints();

        // adds a 'padding' around all elements in the grid
        gbc.insets = new Insets(5,5,2,5);



        //-------------------------creating elements----------------------------


                // creates the standard size I want on the elements

                Dimension standard = new Dimension(200, 25);


                // creates two text fields and sets the size to standard

                JTextField nameField = new JTextField();
                nameField.setPreferredSize(standard);

                JTextField ageField = new JTextField();
                ageField.setPreferredSize(standard);

                JTextField socialField = new JTextField();
                socialField.setPreferredSize(standard);

                    // creating a dropdown box for country's

                String[] county = {"","Norway", "USA", "NON of the above"} ;
                JComboBox<String> countrySelect = new JComboBox<>(county);
                countrySelect.setPreferredSize(standard);

        //----------------sets position of all the elements, and ads labels-------------------

                // specifies how the element is in the cell
                gbc.anchor = GridBagConstraints.EAST;

                     // indexing the position in the grid for the element
                    gbc.gridx = 0; gbc.gridy = 0;

                    panel.add(new JLabel("Name :"), gbc);

                        gbc.gridx = 0; gbc.gridy = 1;

                        panel.add(new JLabel("Age :"), gbc);

                            gbc.gridx = 0; gbc.gridy = 3;

                            panel.add(new JLabel("Citizenship (country) :"), gbc);

                                gbc.gridx = 0; gbc.gridy = 2;

                                panel.add(new JLabel("Social security number :"), gbc);

                gbc.anchor = GridBagConstraints.CENTER;

                    gbc.gridx = 1; gbc.gridy = 0;

                    panel.add(nameField, gbc);


                        gbc.gridx = 1; gbc.gridy = 1;

                        panel.add(ageField, gbc);


                            gbc.gridx = 1; gbc.gridy = 2;

                            panel.add(socialField,gbc);


                                gbc.gridx = 1; gbc.gridy = 3;

                                panel.add(countrySelect, gbc);


                    //----------------------------------------------------------
                        // sets the necessary final statements

                        idFrame.add(panel);

                        // this needs to be at the bottom for the content to be shown on the frame as the frame loads. (if not here : have to resize the frame to see content)
                        idFrame.setVisible(true);

        }

}
