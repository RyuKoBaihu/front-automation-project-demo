package Actions;

import Pages.ComplicatedPagePage;

import static Utils.ClickElements.clickByName;
import static Utils.SendKeys.sendKeysByID;

public class SectionRandomStuffActions extends ComplicatedPagePage {

    String name = "Name";

    public void fillingSectionRandom() {
        sendKeysByID(name,ID_INPUT_NAME);
        sendKeysByID(name,ID_INPUT_EMAIL_ADDRESS);
        sendKeysByID(name,ID_INPUT_MESSAGE);
        sendKeysByID(name,ID_INPUT_CAPTCHA);
        clickByName(NAME_BUTTON_SUBMIT);
    }
}
