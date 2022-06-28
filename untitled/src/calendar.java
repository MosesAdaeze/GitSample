import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.jar.JarEntry;
import java.util.Calendar;

//public class calendar extends JFormattedTextField.AbstractFormatter {
//
//   private Util model = new UtilDateModel();
//    JDatePanelImpl datePanel = new JDatePanelImpl(model);
//    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
//    frame.add(datePicker);
//
//        private String datePattern = "yyyy-MM-dd";
//        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
//
//        @Override
//        public Object stringToValue (String text) throws ParseException {
//            return dateFormatter.parseObject(text);
//        }
//
//        @Override
//        public String valueToString (Object value) throws ParseException {
//            if (value != null) {
//                Calendar cal = (Calendar) value;
//                return dateFormatter.format(cal.getTime());
//            }
//
//            return "";
//        }
