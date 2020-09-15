package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsLocators {

    // @FindBy(xpath = "//div[contains(@class,'req-info-section__form col-12
    // offset-lg-1 col-lg-5 prefill-dropdowns')]//div[contains(@class,'inline-form
    // seahawk_inline_relative')]")
    @FindBy(xpath = "//*[@id='rfi']")
    public WebElement footerRFI;

    @FindBy(xpath = "//h4[@class='rfi-heading']")
    public WebElement footerRFItxt;

    // ************** FOOTER RFI ******************** //

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[1]/div")
    public WebElement degreeLeveloptions;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[1]/div/ul/li[2]")
    public WebElement degreeLevel;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[2]/div")
    public WebElement programoptions;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[2]/div/ul/li[2]")
    public WebElement programInterrest;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/select")
    public WebElement programInterrest1;

    @FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
    public WebElement fName;

    @FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
    public WebElement lName;

    @FindBy(xpath = "//input[contains(@placeholder,'Email')]")
    public WebElement email;

    @FindBy(xpath = "//input[contains(@placeholder,'Phone')]")
    public WebElement phone;

    @FindBy(xpath = "//input[contains(@placeholder,'ZIP Code')]")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@id='rfi']/div[8]/div/input")
    public WebElement no;

    @FindBy(xpath = "//*[@id='rfi']/div[8]/div/input[2]")
    public WebElement yes;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement agreenGobtn;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement agreenGobtnrfi;

    @FindBy(xpath = "//*[@class='required-message']")
    public WebElement errorMessgae;

    @FindBy(xpath = "//*[@id='Phone-error']")
    public WebElement phoneerrorMessgae;

    @FindBy(xpath = "//*[@id='FirstName-error']")
    public WebElement fNameError;
    @FindBy(xpath = "//*[@id='LastName-error']")
    public WebElement lNameError;
    @FindBy(xpath = "//*[@id='Email-error']")
    public WebElement eMailError;
    @FindBy(xpath = "//*[@id='Phone-error']")
    public WebElement phoneError;
    @FindBy(xpath = "//*[@id='Zipcode-error']")
    public WebElement zipeError;

    @FindBy(xpath = "//*[@id='banner-rfi']")
    public WebElement bannerRFI;

    @FindBy(xpath = "//form[@id='banner-rfi']//h4[@class='heading m-0 pt- pb-'][contains(text(),'REQUEST INFORMATION')]")
    public WebElement bannerRFItxt;

    @FindBy(xpath = "//*[@class='rfi__secondary-heading text-uppercase secondary-heading']")
    public WebElement thnq;

    @FindBy(xpath = "//div[@class='col-xl-5 col-lg-6 col-sm-7 col-10 float-right pl-85']//a[@class='track-link']")
    public WebElement ribbonchatnow;

    @FindBy(xpath = "//span[contains(text(),'877.445.7180')]")
    public WebElement ribbonMobileNo;

    @FindBy(xpath = "//span[contains(text(),'Request Info')]")
    public WebElement ribbonReqInfo;
    // / Banner RFI

    @FindBy(xpath = "//*[@id='rfi']/div[1]/select")
    public WebElement selectdegreeLevelBR;

    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[1]/div")
    public WebElement degreeLeveloptionsBR;
    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[1]/div/ul/li[2]")
    public WebElement degreeLevelBR;

    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[2]/div")
    public WebElement programoptionsBR;

    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[2]/div/ul/li[2]")
    public WebElement programInterrestBR;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/select")
    public WebElement programInterrest1BR;

    @FindBy(xpath = "//div[contains(@class,'inline-form seahawk_inline_relative')]//div//input[@placeholder='First Name']")
    public WebElement fNameBR;

    @FindBy(xpath = "//div[contains(@class,'inline-form seahawk_inline_relative')]//div//input[@placeholder='Last Name']")
    public WebElement lNameBR;

    @FindBy(xpath = "//div[contains(@class,'inline-form seahawk_inline_relative')]//div//input[@placeholder='Email']")
    public WebElement emailBR;

    @FindBy(xpath = "//div[contains(@class,'inline-form seahawk_inline_relative')]//div//input[@placeholder='Phone']")
    public WebElement phoneBR;

    @FindBy(xpath = "//div[contains(@class,'inline-form seahawk_inline_relative')]//div//input[@placeholder='ZIP Code']")
    public WebElement zipcodeBR;

    @FindBy(xpath = "//form[@id='banner-rfi']//button[@class='btn btn-primary'][contains(text(),'Agree & Go')]")
    public WebElement agreenGobtnBR;

    @FindBy(xpath = "//h3[@class='heading m-0 pt- pb-']")
    public WebElement bannerRFItxtvbr;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement fNameVBR;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lNameVBR;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailVBR;

    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement phoneVBR;

    @FindBy(xpath = "//*[@name='Zipcode']")
    public WebElement zipcodeVBR;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement agreenGobtnVBR;

    // *******************Degree Form **************************************
    @FindBy(xpath = "//form[@id='degree-header-rfi']")
    public WebElement degreeForm;

    @FindBy(xpath = "//*[@name='FirstName']")
    public WebElement fNameDF;
    @FindBy(xpath = "//*[@name='LastName']")
    public WebElement lNameDF;

    @FindBy(xpath = "//*[@name='Email']")
    public WebElement EmailDF;
    @FindBy(xpath = "//*[@name='Company']")
    public WebElement Company;

    @FindBy(xpath = "//*[@name='Title']")
    public WebElement Title;
    @FindBy(xpath = "//*[@name='Comments']")
    public WebElement Comments;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement SubmitBtnDF;
    @FindBy(xpath = "    //*[@id='rfi-form-modal']/div[1]/div[2]/div")
    public WebElement successwind;
    @FindBy(xpath = "//span[@id='rfi-form-modal-close']")
    public WebElement closeBtn;
    // ***************************Download form**************************
    @FindBy(xpath = "//a[@class='download-rfi__rfi-button']")
    public WebElement DwnFrmBtn;
    // Download Form

    @FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'First Name')]")
    public WebElement dwfName;
    @FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'Last Name')]")
    public WebElement dwlName;

    @FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'Email')]")
    public WebElement dwEmail;
    @FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'Phone')]")
    public WebElement dwPhone;
    @FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'ZIP Code')]")
    public WebElement dwZipCode;

    @FindBy(xpath = "//button[contains(text(),'Agree & Go')]")
    public WebElement dwAgreenGo;

    @FindBy(xpath = "//form[@id='download-rfi']//button[@class='btn btn-primary'][contains(text(),'Agree & Go')]")
    public WebElement cfdwAgreenGo;

    // ********************************* Microsite Form

    @FindBy(xpath = "//div[@class='banner-rfi-microsites pr-0']")
    public WebElement mForm;

    @FindBy(xpath = "//*[@name='FirstName']")
    public WebElement fNamemf;
    @FindBy(xpath = "//*[@name='LastName']")
    public WebElement lNamemf;

    @FindBy(xpath = "//*[@name='Email']")
    public WebElement Emailmf;
    @FindBy(xpath = "//*[@name='Phone']")
    public WebElement Phonemf;
    @FindBy(xpath = "//*[@name='Zipcode']")
    public WebElement ZipCodemf;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement submitBtnmf;

    @FindBy(xpath = "//form[@id='banner-rfi-microsite']//select[@name='EducationLevel']")
    public WebElement educationoptionsmf;

    @FindBy(xpath = "//*[@id='banner-rfi-microsite']/div[8]/div/select/option[2]")
    public WebElement educationoptionsvalmf;

    @FindBy(xpath = "//form[@id='download-rfi']//select[@name='EducationLevel']")
    public WebElement educationoptionsdf;

    @FindBy(xpath = "//*[@id='download-rfi']/div[7]/div/select/option[2]")
    public WebElement educationoptionsvaldf;

    // ***************************** Nominate Teachers Form

    @FindBy(xpath = "//*[@name='faculty_first_name']")
    public WebElement fFname;

    @FindBy(xpath = "//*[@name='faculty_last_name']")
    public WebElement fLname;

    @FindBy(xpath = "//*[@name='field_campus']")
    public WebElement campus;

    @FindBy(xpath = "//*[@name='teach_program']")
    public WebElement teachprogram;

    @FindBy(xpath = "//*[@name='please_describe_the_reason']")
    public WebElement reason;

    @FindBy(xpath = "//*[@name='student_s_first_name']")
    public WebElement sFname;

    @FindBy(xpath = "//*[@name='student_s_last_name']")
    public WebElement sLname;

    @FindBy(xpath = "//*[@name='student_s_home_campus']")
    public WebElement shomecampus;

    @FindBy(xpath = "//*[@name='student_id']")
    public WebElement sId;

    @FindBy(xpath = "//*[@class='error']")
    public WebElement ErrorMessage;

    @FindBy(xpath = "//*[@id='nominate-a-teacher']")
    public WebElement nominateateacherform;

    @FindBy(xpath = "//*[@id='valedictorian-application']")
    public WebElement valedictorianapplicationform;

    // *************** Linked-in Form

    @FindBy(xpath = "//*[@name='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@name='Email']")
    public WebElement emaillf;

    @FindBy(xpath = "//*[@name='Phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='ZipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id='linkedin-rfi']/div[7]/fieldset/div/span[2]/input")
    public WebElement tCYesInLinkedinForm;

    @FindBy(xpath = "//div//div//div//div//div//div//div//div//div//div//div//div//div[7]//fieldset[1]//div[1]//span[2]//input[1]")
    public WebElement tCYesInShortForm;

    @FindBy(xpath = "//div//div//div//div//div//div//div//div//div//div//div//div//div[8]//fieldset[1]//div[1]//span[2]//input[1]")
    public WebElement tCYesInShortFormdd;
    @FindBy(xpath = " //div//div//div//div//div//div//div//div//div//div//div//div//div[10]//fieldset[1]//div[1]//span[2]//input[1]")
    public WebElement tCYesInLongtForm;

    @FindBy(xpath = " //*[@id=\"twostep-rfi-banner\"]/div[9]/fieldset/div/span[2]/input")
    public WebElement tCYesInTwoStepForm;

    @FindBy(xpath = "//button[contains(text(),'AGREE & GO')]")
    public WebElement submitBtnlf;

    @FindBy(xpath = "//*[@id='login']")
    public WebElement AutoFillBtn;

    @FindBy(xpath = " //*[@id='autofill-button']/div/span")
    public WebElement SignInFillBtn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement UNameLForm;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement PwdLForm;

    @FindBy(xpath = "//*[@id='app__container']/main/div[2]/div[2]/form/div[3]/button")
    public WebElement SigninLForm;

    // ********************* SHORT FORM

    @FindBy(xpath = "//div[contains(@class,'shortform aem-GridColumn aem-GridColumn--default--12')]//section[contains(@class,'visible-desktop')]")
    public WebElement shortform;

    @FindBy(xpath = "//a[@id='scrollToForm']")
    public WebElement shortformnavigation;
    
  
    
    @FindBy(xpath = "//section[@id='request-info']//div//input[contains(@placeholder,'First Name')]")
    public WebElement fNamesf;
    @FindBy(xpath = "//section[@id='request-info']//div//input[contains(@placeholder,'Last Name')]")
    public WebElement lNamesf;
    @FindBy(xpath = "//section[@id='request-info']//div//input[contains(@placeholder,'Email')]")
    public WebElement emailsf;

    @FindBy(xpath = "//section[@id='request-info']//div//input[contains(@placeholder,'Phone')]")
    public WebElement phoneNumbersf;
    @FindBy(xpath = "//section[@id='request-info']//div//input[contains(@placeholder,'ZIP Code')]")
    public WebElement zipCodesf;
    @FindBy(xpath = "//section[@id='request-info']//div//button[contains(@class,'btn btn-primary')][contains(text(),'AGREE & GO')]")
    public WebElement AgreeBtnsf;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Degree')]")
    public WebElement degreeLeveloptionssf;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Degree')]//option[contains(text(),'MBA')]")
    public WebElement degreeLevelsf;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Program')]")
    public WebElement programoptionssf;

    @FindBy(xpath = "//option[contains(text(),'Business Administration')]")
    public WebElement programInterrestsf;

    // ******************** TWO STEP FORM

    @FindBy(xpath = "//*[@class='capella-form ']")
    public WebElement twoStepForm;
    @FindBy(xpath = "//*[@name='FirstName']")
    public WebElement fName2sf;
    @FindBy(xpath = "//*[@name='LastName']")
    public WebElement lName2sf;

    @FindBy(xpath = "//*[@name='Email']")
    public WebElement Email2sf;
    @FindBy(xpath = "//*[@name='Phone']")
    public WebElement Phone2sf;
    @FindBy(xpath = "//input[@placeholder='ZIP Code* (5 digits)']")
    public WebElement ZipCode2sf;

    @FindBy(xpath = "//*[@id='twostep-rfi-banner']/div[4]/div/input")
    public WebElement address2sf;

    @FindBy(xpath = "//*[@name='Degree']")
    public WebElement degreeLevel2sf;
    @FindBy(xpath = "//select[@name='Degree']//option[contains(text(),'MBA')]")
    public WebElement degreeLevelOptions2sf;
    @FindBy(xpath = "//*[@name='Program']")
    public WebElement program2sf;
    @FindBy(xpath = "//option[contains(text(),'Business Administration')]")
    public WebElement programOptions2sf;

    @FindBy(xpath = "//*[@class='btn btn-secondary']")
    public WebElement nextBtn2sf;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement submitBtn2sf;
    // ******************************* LONG FORM

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//form[@id='longform-rfi']")
    public WebElement lognForm;
    @FindBy(xpath = " //section[contains(@class,'visible-desktop')]//div//input[contains(@title,'First Name')]")
    public WebElement fNamelf;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@title,'Last Name')]")
    public WebElement lNamelf;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@title,'Street Address*')]")
    public WebElement addresslf;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@title,'Email')]")
    public WebElement emaillform;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@name,'Phone')]")
    public WebElement phoneNumberlf;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@name,'ZipCode')]")
    public WebElement zipCodelf;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@name,'Zipcode')]")
    public WebElement zipCode1lf;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'EducationLevel')]")
    public WebElement educationLevellf;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//option[contains(text(),'Some post graduate')]")
    public WebElement educationLevelOptionslf;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Degree')]")
    public WebElement degreeLevellf;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//div[contains(@class,'dropdown-wrapper-strayer dynamic-dependent-dropdowns')]//option[contains(text(),'Certificates')]")
    public WebElement degreeLevelOptionslf;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Program')]")
    public WebElement programlf;
    @FindBy(xpath = "//option[contains(text(),'Digital Entrepreneurship')]")
    public WebElement programOptionslf;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//button[contains(@class,'btn btn-primary')][contains(text(),'Agree & Go')]")
    public WebElement submitBtnlform;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//button[contains(@class,'btn btn-primary')]")
    public WebElement AgreeBtnlf;
    // ********************************************** SU APPLICATION

    @FindBy(id = "loginForm")
    public WebElement mcLoginForm;

    @FindBy(xpath = "//*[@id='VcHeader']/div/ul[2]/li[6]/a/div/span[1]")
    public WebElement loginLink;

    /** This variable is for Prospective Students Link. */
    @FindBy(linkText = "Prospective Students")
    public WebElement prosStudLink;

    /** This variable is for My Profile after Login Link. */
    // @FindBy(partialLinkText = "MY PROFILE")
    @FindBy(xpath = "//*[@id='VcHeader']/div/ul[2]/li[6]/a/div/span[1]")
    public WebElement myProfileLink;

    /** This variable is for Login Username. */
    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement loginUsername;

    /** This variable is for Login Username. */
    @FindBy(xpath = "//input[contains(@placeholder,'Email Address')]")
    public WebElement loginUser;

    /** This variable is for Login password. */
    @FindBy(name = "password")
    public WebElement loginPwd;

    /** This variable is for Login Button. */
    @FindBy(xpath = "//*[@id='loginForm']/div[6]/div/button")
    public WebElement loginBtn;

    // ******************* REGISTRATION

    /** This variable is for My Capella Create Registration Link. */
    @FindBy(linkText = "Create a new account")
    public WebElement mcCreateAccntLnk;

    /** This variable is for My Capella SignUp Form. */
    @FindBy(id = "signUpForm")
    public WebElement mcSignUpForm;

    @FindBy(name = "firstname")
    public WebElement mcFNameFormElement;

    /** This variable is for My Capella Last Name Element. */
    @FindBy(name = "lastname")
    public WebElement mcLNameFormElement;

    /** This variable is for My Capella Password Element. */
    @FindBy(name = "password")
    public WebElement mcPwdFormElement;

    /** This variable is for My Capella Confirm Password Element. */
    @FindBy(name = "confirmpassword")
    public WebElement mcCnfmPwdFormElement;

    /** This variable is for Email Address Element. */
    @FindBy(name = "email")
    public WebElement emailAddrFormElement;

    /** This variable is for My Capella Registration button. */
    @FindBy(xpath = "//*[@id='signUpForm']/div[9]/div/button")
    public WebElement mcRegSubmitButton;

    /** This variable is for My Capella Logout button. */
    @FindBy(xpath = "//*[@id='VcHeader']/div/ul[2]/li[6]/div/div[5]/a")
    public WebElement logOutLink;

    /** This variable is for My Capella Reset Password Link. */
    @FindBy(linkText = "Reset your password")
    public WebElement restPwdlink;

    /** This variable is for My Capella Request Password Button. */
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement reqPwdbtn;

    /** This variable is for My Capella Forgot Password Form. */
    @FindBy(xpath = "//form[@id='forgotPasswordForm']")
    public WebElement frgtpwdForm;

    /** This variable is for My Capella Forgot Password Form window. */
    @FindBy(xpath = "//div[@id='formModal']//div[contains(@class,'modal-body')]")
    public WebElement frgtpwdFormWnd;

    /** This variable is for My Capella Forgot Password Form Sucess Ok btn. */
    @FindBy(xpath = "//a[@class='btn btn-primary forgot-success']")
    public WebElement frgtpwdsucBtn;

    /** This variable is for My Capella Forgot Password Form Sucess Ok btn. */
    @FindBy(xpath = "//a[contains(text(),'Forgot your username?')]")
    public WebElement frgtUnameLink;

    /** This variable is for My Capella Forgot Password Form window. */
    @FindBy(xpath = "//div[@id='formModal']//div[contains(@class,'modal-body')]")
    public WebElement frgtUnameWnd;

    /** This variable is for My Capella Forgot Password Form. */
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement ContinueBtn;

    @FindBy(xpath = "//div[@id='formModal']//button[@class='close'][contains(text(),'close x')]")
    public WebElement CloseBtn;

    // ************************ EMAIL US

    /** This variable is for Ask a Question Link. */
    @FindBy(xpath = "//span[contains(text(),'Ask a Question')]")
    public WebElement askaQuestionElement;

    /** This variable is for Email Us Element. */
    @FindBy(linkText = "Email Us")
    public WebElement emailUsLinkElement;

    /** This variable is for Email Us Element. */
    @FindBy(xpath = "//*[@id='emailUsForm']")
    public WebElement emailUsForm;

    /** This variable is for Degree Element. */
    @FindBy(name = "degree")
    public WebElement degreeFormElement;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='emailUsForm']/div[3]/div/div[3]/select/option[3]")
    public WebElement degreeFormElementOptions;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='leadForm']/div[3]/div/div[3]/select/option[3]")
    public WebElement RFIdegreeElementOptions;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='ConsultationForm']/div[3]/div/div[3]/select/option[3]")
    public WebElement CFdegreeElementOptions;

    /** This variable is for AOS Element. */
    @FindBy(name = "aos")
    public WebElement aosFormElement;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='emailUsForm']/div[3]/div/div[4]/select/option[3]")
    public WebElement aosFormElementOptions;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='leadForm']/div[3]/div/div[4]/select/option[3]")
    public WebElement RFIaosElementOptions;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='ConsultationForm']/div[3]/div/div[4]/select/option[3]")
    public WebElement CFaosElementOptions;

    /** This variable is for Spec Element. */
    @FindBy(name = "program_code")
    public WebElement specFormElement;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='emailUsForm']/div[3]/div/div[6]/select/option[5]")
    public WebElement specFormElementOptions;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='ConsultationForm']/div[3]/div/div[6]/select/option[5]")
    public WebElement CFFormElementOptions;

    /** This variable is for Degree Element. */
    @FindBy(xpath = "//*[@id='leadForm']/div[3]/div/div[6]/select/option[5]")
    public WebElement RFIspecElementOptions;

    @FindBy(name = "commit_start_date")
    public WebElement startDate;

    @FindBy(xpath = "//*[@id='leadForm']/div[4]/div/select/option[2]")
    public WebElement startDateOptions;

    @FindBy(xpath = "//*[@id='ConsultationForm']/div[4]/div/select/option[2]")
    public WebElement CFstartDateOptions;

    @FindBy(xpath = "//*[@name='first_name']")
    public WebElement emailUsFName;

    @FindBy(xpath = "//*[@name='last_name']")
    public WebElement emailUsLName;
    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailUsEmail;
    @FindBy(xpath = "//*[@name='phone']")
    public WebElement emailUsPhone;
    @FindBy(xpath = "//*[@name='notes']")
    public WebElement emailUsComments;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement emailUsAgreeBtn;

    @FindBy(xpath = " //*[@class='btn btn-primary form-btn-submit mt-5 b-0 px-md-3']")
    public WebElement viewProgBtn;

    @FindBy(xpath = "//div[@id='formModal']//div[@class='modal-body']")
    public WebElement emailUsThnqWnd;

    @FindBy(xpath = "//h2[@class='h1']")
    public WebElement emailUsThnqMsg;

    @FindBy(xpath = "//div[@id='formModal']//button[@class='close'][contains(text(),'close x')]")
    public WebElement emailUsCloseBtn;

    @FindBy(xpath = "//*[@name='zip']")
    public WebElement Zip;

    /** This variable is for Request Information Element. */
    @FindBy(linkText = "Request Information")
    public WebElement reqInfoLinkElement;

    @FindBy(xpath = "//*[@id='ConsultationForm']")
    public WebElement RFIForm;

    @FindBy(xpath = "//*[@id='ConsultationForm']")
    public WebElement ConsultationForm;

    /** This variable is for Schedule Consultation Element. */
    @FindBy(xpath = "//*[@class='nav-item dropdown dropdown-hover show']//*[@title='Schedule Consultation']")
    public WebElement scheduleConsultationLinkElement;

    // **************** REFER A FRIEND

    @FindBy(xpath = "//*[@id='referAFriend']")
    public WebElement RefFrndForm;

    @FindBy(xpath = "//*[@name='referrer_first_name']")
    public WebElement refFName;

    @FindBy(xpath = "//*[@name='referrer_last_name']")
    public WebElement refLName;

    @FindBy(xpath = "//*[@name='referrer_email']")
    public WebElement refEmail;

    /** This variable is for I am a Element. */
    @FindBy(name = "referrer_group_id")
    public WebElement RefIamElement;

    /** This variable is for I am a Element Options. */
    @FindBy(xpath = "//*[@id='referAFriend']/div[5]/div/select/option[2]")
    public WebElement RefIamElementOptions;

    /** This variable is for I am a Element Options. */
    @FindBy(xpath = "//h2[@class='h1']")
    public WebElement RefFrnThqWnd;

    @FindBy(xpath = "//*[@id='Email']")
    public WebElement eNewsEmail;

    @FindBy(xpath = "//button[@class='btn btn-common btn-text-none']")
    public WebElement AgnGoBtn;

    // longform-rfi
    @FindBy(xpath = "//*[@id='longform-rfi']")
    public WebElement LetsGoForm;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//input[contains(@placeholder,'First Name*')]")
    public WebElement PurlFName;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//input[contains(@placeholder,'Last Name*')]")
    public WebElement PurlLName;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//input[contains(@placeholder,'Street Address*')]")
    public WebElement PurlAddress;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//input[contains(@placeholder,'Email Address*')]")
    public WebElement PurlEmail;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//input[contains(@placeholder,'Daytime Phone* (10 digits)')]")
    public WebElement PurlPhoneNo;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//input[contains(@placeholder,'ZIP Code* (5 digits)')]")
    public WebElement PurlZip;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//select[contains(@name,'Degree')]")
    public WebElement PurlDegree;

    @FindBy(xpath = "//section[contains(@class,'pb-3 visible-desktop')]//div//select[contains(@name,'Program')]")
    public WebElement PurlArea;
/// LP FORM
    /** This variable is for Degree Element. */
    @FindBy(xpath = "//select[@name='degree']")
    public WebElement LPdegreeElementOptions;

    /** This variable is for AOS Element. */
    @FindBy(xpath = "//select[@name='aos']")
    public WebElement aosLPFormElement;

    /** This variable is for AOS Element. */
    @FindBy(xpath = "//select[@name='aos']")
    public WebElement LPaosElementOptions;

    /** This variable is for SPEC Element. */
    @FindBy(xpath = "//select[@name='program_code']")
    public WebElement LPspecElementOptions;

    /** This variable is for Education Level Element. */
    @FindBy(xpath = "//select[@name='education_level']")
    public WebElement EduLevelElementOptions;

    /** This variable is for Age Level Element. */
    @FindBy(xpath = "//select[@name='age_21']")
    public WebElement AgeOptions;

    /** This variable is for Military Level Element. */
    @FindBy(xpath = "//span[2]//input[1]")
    public WebElement MilOptions;

    /** This variable is for Error Modal Level Element. */
    @FindBy(xpath = "//p[contains(text(),'Thank you for your interest.')]")
    public WebElement errorModal;

    @FindBy(xpath = "//option[contains(text(),'Grad Cert - Business Administration')]")
    public WebElement LPspecElementOptionsBachelors;

    /** This variable is for Date Element. */
    @FindBy(xpath = "//select[@name='commit_start_date']")
    public WebElement DateLPFormElement;

    /** This variable is for Date Element. */
    @FindBy(xpath = "//option[contains(text(),'As soon as possible')]")
    public WebElement LPDateElementOptions;

    /** This variable is for First Name Element. */
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement LPFName;

    /** This variable is for Last Name Element. */
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement LPLName;

    /** This variable is for Email Element. */
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement LPEmail;

    /** This variable is for Phone No Element. */
    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement LPPhone;

    /** This variable is for Phone No Element. */
    @FindBy(xpath = "//input[@placeholder='ZIP/Postal Code']")
    public WebElement LPZip;

    /** This variable is for Phone No Element. */
    @FindBy(xpath = "//div[@class='title-section px-3 d-none d-md-block']")
    public WebElement ThankYou;

    /** This variable is for Degree Error Element. */
    @FindBy(xpath = "//div[@id='degree-error']")
    public WebElement LPdegError;

    /** This variable is for AOS Error Element. */
    @FindBy(xpath = "//div[@id='aos-error']")
    public WebElement LPaosError;

    /** This variable is for Program Error Element. */
    @FindBy(xpath = "//div[@id='program_code-error']")
    public WebElement LPprogError;

    /** This variable is for FirstName Error Element. */
    @FindBy(xpath = "//div[@id='first_name-error']")
    public WebElement LPfnameError;

    /** This variable is for Last Name Error Element. */
    @FindBy(xpath = "//div[@id='last_name-error']")
    public WebElement LPlnameError;

    /** This variable is for Email Error Element. */
    @FindBy(xpath = "//div[@id='email-error']")
    public WebElement LPemailError;

    /** This variable is for Email Validations Error Element. */
    @FindBy(xpath = "//*[@class='error-summary p-l-1']")
    public WebElement LPemailvalidError;

    /** This variable is for Phone No Error Element. */
    @FindBy(xpath = "//div[@id='phone-error']")
    public WebElement LpphoneError;

    /** This variable is for ZIP Error Element. */
    @FindBy(xpath = "//div[@id='zip-error']")
    public WebElement LPzipError;

//************************ PFQ Form    

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//button[contains(text(),'Take the Quiz')]")
    public WebElement TakeQuizButton;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//label[1]//span[1]")
    public WebElement s1c1;

    /** This variable is for Next Button in PFQ Form. */
    @FindBy(xpath = "//button[@class='btn btn-common']")
    public WebElement NextBtn;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//label[1]//span[1]")
    public WebElement s2c1;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//label[1]//span[1]")
    public WebElement s3c1;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//label[1]//span[1]")
    public WebElement s4c1;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//form[@class='ng-pristine ng-valid']//div[2]//div[1]//div[1]")
    public WebElement s5op1;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//form[@class='ng-pristine ng-valid']//div[4]//div[1]//div[1]")
    public WebElement s5op2;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//form[@class='ng-pristine ng-valid']//div[6]//div[1]//div[1]")
    public WebElement s5op3;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//form[@class='ng-pristine ng-valid']//div[8]//div[1]//div[1]")
    public WebElement s5op4;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//form[@class='ng-pristine ng-valid']//div[10]//div[1]//div[1]")
    public WebElement s5op5;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//*[@id='rangeselector_0']")
    public WebElement s6op1;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//*[@id='rangeselectortext_0']")
    public WebElement s7op1;

    /** This variable is for PFQ Form. */
    @FindBy(xpath = "//div[@id='views']")
    public WebElement PFQForm;

    /** This variable is for Degree Element in PFQ Form. */
    @FindBy(xpath = "//*[@id='degree_code']")
    public WebElement PFQDegree;

    /** This variable is for AOS Element in PFQ Form. */
    @FindBy(xpath = "//*[@id='study_area_code']")
    public WebElement PFQAos;

    /** This variable is for Specialization Element in PFQ Form. */
    @FindBy(xpath = "//*[@id='study_area_spec']")
    public WebElement PFQSpl;

    /** This variable is for First Name Element in PFQ Form. */
    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement PFQFName;

    /** This variable is for Last Name Element in PFQ Form. */
    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement PFQLName;

    /** This variable is for Email Element in PFQ Form. */
    @FindBy(xpath = "//*[@id='Email']")
    public WebElement PFQEmail;

    /** This variable is for Phone No Element in PFQ Form. */
    @FindBy(xpath = "//*[@id='phone']")
    public WebElement PFQPhone;

    /** This variable is for Zip code Element. */
    @FindBy(xpath = "//*[@id='zip']")
    public WebElement PFQZip;

    /** This variable is for Agree and Go Element in PFQ Form. */
    @FindBy(xpath = "//button[contains(text(),'Agree and Go')]")
    public WebElement PFQAgreeNGo;

    /** This variable is for Success Message Element in PFQ Form. */
    @FindBy(xpath = "//div[contains(text(),'100%')]")
    public WebElement PFQSuccessMsg;

    // *********** PEP FORM Locators

    @FindBy(xpath = " //div[@id='nav-tabContent']")
    public WebElement TabContent;

    @FindBy(xpath = "//div[@class='nice-select form-control']")
    public WebElement aosLevelinPEP;

    @FindBy(xpath = " //div[@class='nice-select form-control open']//ul[@class='list']")
    public WebElement aosLevelinPEPList;

    @FindBy(xpath = "//li[contains(text(),'Business')]")
    public WebElement aosOptionsinPEP;

    @FindBy(xpath = "//span[contains(text(),'Degree...')]")
    public WebElement degreeLevelPEP;
    @FindBy(xpath = "//div[@class='nice-select form-control open']//li[@class='option'][contains(text(),'Associate')]")
    public WebElement degreeLevelOptionsPEP;

    @FindBy(xpath = "//span[contains(text(),'Program...')]")
    public WebElement programPEP;
    @FindBy(xpath = "//li[contains(text(),'Associate in Arts in Marketing')]")
    public WebElement programOptionsPEP;

    @FindBy(xpath = " //*[@id='component-2-panel1']/div[2]/div[2]/div/div/div")
    public WebElement pepop;

    /** This variable is for LEARNING OPTIONS' Element in PEP Form. */
    @FindBy(xpath = "//a[contains(text(),'LEARNING OPTIONS')]")
    public WebElement LearningOptBtn;

    @FindBy(xpath = "//label[contains(text(),'2')]")
    public WebElement PepOp1;

    @FindBy(xpath = "//label[contains(text(),'3 (take 1 term off each year)')]")
    public WebElement PepOp2;

    @FindBy(xpath = "//label[contains(text(),'Online: All of our degree programs are offered onl')]")
    public WebElement PepOp3;

    @FindBy(xpath = "//input[@id='edit-submitted-other-ways-to-accelerate-your-program-first-enroll-at-strayer']")
    public WebElement PepOp4;

    @FindBy(xpath = "//input[@id='edit-submitted-credit-and-reduce-courses-not-credits']")
    public WebElement PepOp5;

    @FindBy(xpath = "//*[@id='component-2-panel2']//a[contains(text(),'Show Results')]")
    public WebElement PepOpSRsltBtn;

    @FindBy(xpath = "//*[@id='component-2-panel2']//a[contains(text(),'Ways To Save')]")
    public WebElement PepOpWayToSaveBtn;

    @FindBy(xpath = " //div[contains(@class,'nice-select form-control inline-form-select required')]")
    public WebElement PepOp6;

    @FindBy(xpath = " //*[@id='component-2-panel3']/div[2]/form/div[1]/div/ul/li[2]")
    public WebElement PepOp7;

    @FindBy(xpath = "//a[contains(text(),'Show Results')]")
    public WebElement ShowResultsBtn;

    @FindBy(xpath = "//a[contains(text(),'Complete My Plan')]")
    public WebElement CompleMyPlanBtn;

    /** This variable is for PEP Form. */
    @FindBy(xpath = "//form[@id='pep-rfi']")
    public WebElement PEPForm;

    /** This variable is for First Name Element in PEP Form. */
    @FindBy(xpath = "//form[@id='pep-rfi']//input[contains(@placeholder,'First Name')]")
    public WebElement PEPFName;

    /** This variable is for Last Name Element in PEP Form. */
    @FindBy(xpath = "//form[@id='pep-rfi']//input[contains(@placeholder,'Last Name')]")
    public WebElement PEPLName;

    /** This variable is for Email Element in PEP Form. */
    @FindBy(xpath = "//form[@id='pep-rfi']//input[contains(@placeholder,'Email')]")
    public WebElement PEPEmail;

    /** This variable is for Phone No Element in PEP Form. */
    @FindBy(xpath = "//form[@id='pep-rfi']//input[contains(@placeholder,'Phone')]")
    public WebElement PEPPhone;

    /** This variable is for Zip code Element in PEP Form. */
    @FindBy(xpath = "//form[@id='pep-rfi']//input[contains(@placeholder,'ZIP Code')]")
    public WebElement PEPZip;

    /** This variable is for Agree and Go Element in PEP Form. */
    @FindBy(xpath = "//form[@id='pep-rfi']//div//div//button")
    public WebElement PEPAgreeNGo;

}
