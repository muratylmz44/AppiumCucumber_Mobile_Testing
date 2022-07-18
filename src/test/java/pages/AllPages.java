package pages;

import pages.android.*;
import pages.ios.AlertViewsPage;
import pages.ios.IOSSwitchPage;
import pages.ios.PickerViewPage;


public class AllPages {

    //parametresiz contractor olustur
    public AllPages(){}
    //her page class return type ile private instance olusturduk;
    private APIDemosPage apiDemosPage;
    private MainPage mainPage;
    private PreferenceDependenciesPage preferenceDependenciesPage;
    private PreferencePage preferencePage;
    private SwitchPage switchPage;
    private ViewsPage viewsPage;
    private DragDropPage dragDropPage;
    private DateWidgetsPage dateWidgetsPage;
    private ExpandableListsPage expandableListsPage;
    private SpinnerPage spinnerPage;
    //======== burdan asagisi ios pageleri
    private AlertViewsPage alertViewsPage;
    private IOSSwitchPage iosSwitchPage;
    private PickerViewPage pickerViewPage;

    //her page klass icin public method olsuturp obje olustracagiz
    public APIDemosPage apiDemosPage(){
        if (apiDemosPage == null){
            apiDemosPage = new APIDemosPage();
        }
        return apiDemosPage;
    }
    public MainPage mainPage(){
        if (mainPage == null){
            mainPage =  new MainPage();
        }
        return mainPage;
    }

    public PreferencePage preferencePage(){
        if (preferencePage== null){
            preferencePage = new PreferencePage();
        }
        return preferencePage;
    }

    public PreferenceDependenciesPage preferenceDependenciesPage(){
        if (preferenceDependenciesPage == null){
            preferenceDependenciesPage = new PreferenceDependenciesPage();
        }
        return preferenceDependenciesPage;
    }

    public SwitchPage switchPage(){
        if (switchPage == null){
            switchPage = new SwitchPage();
        }
        return switchPage;
    }
    public ViewsPage viewsPage(){
        if (viewsPage == null){
            viewsPage = new ViewsPage();
        }
        return viewsPage;
    }

    public DragDropPage dragDropPage(){
        if (dragDropPage == null){
            dragDropPage = new DragDropPage();
        }
        return dragDropPage;
    }

    public DateWidgetsPage dateWidgetsPage(){
        if (dateWidgetsPage == null){
            dateWidgetsPage = new DateWidgetsPage();
        }
        return dateWidgetsPage;
    }

    public ExpandableListsPage expandableListsPage(){
        if (expandableListsPage == null){
            expandableListsPage = new ExpandableListsPage();
        }
        return expandableListsPage;
    }
    public SpinnerPage spinnerPage(){
        if (spinnerPage == null){
            spinnerPage = new SpinnerPage();
        }
        return spinnerPage;
    }

    public AlertViewsPage alertViewsPage(){
        if (alertViewsPage == null){
            alertViewsPage = new AlertViewsPage();
        }
        return alertViewsPage;
    }
    public IOSSwitchPage iosSwitchPage(){
        if (iosSwitchPage == null){
            iosSwitchPage = new IOSSwitchPage();
        }
        return iosSwitchPage;
    }
    public PickerViewPage pickerViewPage(){
        if (pickerViewPage == null ){
            pickerViewPage = new PickerViewPage();
        }
        return pickerViewPage;
    }

}