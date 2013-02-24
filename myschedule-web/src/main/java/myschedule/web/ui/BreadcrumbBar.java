package myschedule.web.ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

/**
 * A navigation bar for the main application.
 */
public class BreadcrumbBar extends HorizontalLayout {
	private static final long serialVersionUID = 1L;
    private MyScheduleUi myScheduleUi;
    private Button schedulerCrumb;

    public BreadcrumbBar(MyScheduleUi myScheduleUi) {
        this.myScheduleUi = myScheduleUi;

        Button dashboardButton = new Button("Dashboard");
        dashboardButton.addClickListener(new Button.ClickListener()
        {
            @Override
            public void buttonClick(Button.ClickEvent event)
            {
                BreadcrumbBar.this.myScheduleUi.loadDashboardScreen();
            }
        });
        addComponent(dashboardButton);
    }

    public void addSchedulerCrumb(String schedulerFullName) {
        if (schedulerCrumb != null)
            removeSchedulerCrumb();

        schedulerCrumb = new Button(schedulerFullName);
        addComponent(schedulerCrumb);
    }

    public void removeSchedulerCrumb() {
        if (schedulerCrumb == null)
            return;

        removeComponent(schedulerCrumb);
        schedulerCrumb = null;
    }
}
