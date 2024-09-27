package com.practice.wicket.web.pages;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.basic.Label;
import org.wicketstuff.annotation.mount.MountPath;


@WicketHomePage
@MountPath(value = "/home")
public class HomePage extends BasePage {
    public HomePage() {
        Label label = new Label("applicationName", "My App");
        add(label);
    }
}
