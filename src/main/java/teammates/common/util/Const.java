package teammates.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 * Stores constants that are widely used across classes. 
 * this class contains several nested classes, each containing a specific
 * category of constants.
 */

public class Const {
	
	public class SystemParams{

		public static final String ENCODING = "UTF8";
		public static final int NUMBER_OF_HOURS_BEFORE_CLOSING_ALERT = 24;
		/** e.g. "2014-04-01 11:59 PM UTC" */
		public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd h:mm a Z";
		/** Number to trim the Google ID when displaying to the user*/
		public static final int USER_ID_MAX_DISPLAY_LENGTH = 23;
		
		/* Field sizes and error messages for invalid fields can be found 
		 * in the FieldValidator class.
		 */
		
	}

	/* Text displayed to the user when the mouse hover over certain elements in
	 * the UI.
	 */
	public class Tooltips{
	
		public static final String COURSE_ENROLL = "Enroll student into the course";
		public static final String COURSE_ENROLL_SAMPLE_SPREADSHEET = "Download a sample team data spreadsheet";
		public static final String COURSE_DETAILS = "View, edit and send registration keys to the students in the course";
		public static final String COURSE_EDIT = "Edit Course information and instructor list";
		public static final String COURSE_DELETE = "Delete the course and its corresponding students and evaluations";
		public static final String COURSE_ADD_EVALUATION = "Add an evaluation for the course";
		public static final String CLAIMED = "This is student own estimation of his/her contributions to the project";
		public static final String PERCEIVED = "This is the average of what other team members think this student contributed to the project";
		public static final String PERCEIVED_CLAIMED = "Difference between claimed and perceived contribution points";
	
		public static final String COURSE_STUDENT_DETAILS = "View the details of the student";
		public static final String COURSE_STUDENT_EDIT = "Use this to edit the details of this student. <br>To edit multiple students in one go, you can use the enroll page: <br>Simply enroll students using the updated data and existing data will be updated accordingly";
		public static final String COURSE_STUDENT_REMIND = "E-mail the registration key to the student";
		public static final String COURSE_STUDENT_DELETE = "Delete the student and the corresponding evaluations from the course";
	
		public static final String COURSE_REMIND = "Send a reminder to all students yet to join the class";
		public static final String COURSE_DELETE_ALL_STUDENTS = "Delete all students in this course";
	
		public static final String EVALUATION_STATUS_AWAITING = "The evaluation is created but has not yet started";
		public static final String EVALUATION_STATUS_OPEN = "The evaluation has started and students can submit feedback until the closing time";
		public static final String EVALUATION_STATUS_CLOSED = "The evaluation has finished but the results have not been made available to the students";
		public static final String EVALUATION_STATUS_PUBLISHED = "The evaluation has finished and the results have been made available to students";
	
		public static final String EVALUATION_RESULTS = "View the current results of the evaluation";
		public static final String EVALUATION_EDIT = "Edit evaluation details";
		public static final String EVALUATION_REMIND = "Send e-mails to remind students who have not submitted their evaluations to do so";
		public static final String EVALUATION_DELETE = "Delete the evaluation";
		public static final String EVALUATION_PUBLISH = "Publish evaluation results for students to view";
		public static final String EVALUATION_UNPUBLISH = "Make results not visible to students";
		public static final String EVALUATION_SUBMIT = "Start evaluation";
		public static final String EVALUATION_EDIT_SUBMISSION = "Edit submitted evaluation";
		
		public static final String EVALUATION_DIFF = "Perceived Contribution - Claimed Contribution";
		public static final String EVALUATION_RESPONSE_RATE = "Number of students submitted / Class size";
		public static final String EVALUATION_POINTS_RECEIVED = "The list of points that this student received from others";
	
		public static final String EVALUATION_INPUT_COURSE = "Please select the course for which the evaluation is to be created.";
		public static final String EVALUATION_INPUT_START = "Please enter the start date for the evaluation.";
		public static final String EVALUATION_INPUT_NAME = "Enter the name of the evaluation e.g. Mid-term Evaluation 1.";
		public static final String EVALUATION_INPUT_DEADLINE = "Please enter deadline for the evaluation.";
		public static final String EVALUATION_INPUT_COMMENTSSTATUS = "Enable this if you want students to give anonymous feedback to team members.<br />"
				+ "You can moderate those peer feedback before publishing it to the team.";
		public static final String EVALUATION_INPUT_TIMEZONE = "You should not need to change this as your timezone is auto-detected.<br />However, note that daylight saving is not taken into account i.e. if you are in UTC -8:00 and there is<br />"
				+ "daylight saving, you should choose UTC -7:00 and its corresponding timings.";
		public static final String EVALUATION_INPUT_GRACEPERIOD = "Please select the amount of time that the system will continue accepting <br />"
				+ "submissions after the specified deadline.";
		public static final String EVALUATION_INPUT_INSTRUCTIONS = "Please enter instructions for your students, e.g. Avoid comments which are too critical.";
	
		public static final String EVALUATION_SUBMISSION_VIEW_REVIEWER = "View feedback from the student for his team<br />This opens in a new window";
		public static final String EVALUATION_SUBMISSION_VIEW_REVIEWEE = "View feedback from the team for the student<br />This opens in a new window";
		public static final String EVALUATION_SUBMISSION_INSTRUCTOR_EDIT = "Edit feedback from the student for his team<br />This opens in a new window";
	
		public static final String EVALUATION_SUBMISSION_NOT_AVAILABLE = "Not Available: There is no data for this<br />or the data is not enough";
		public static final String EVALUATION_SUBMISSION_NOT_SURE = "Not sure about the contribution";
	
		public static final String STUDENT_JOIN_COURSE = "Enter your registration key for the course.";
		public static final String STUDENT_COURSE_PROFILE = "Your profile in this course";
		public static final String STUDENT_COURSE_DETAILS = "View and edit information regarding your team";
	
		public static final String STUDENT_EVALUATION_STATUS_PENDING = "The evaluation is yet to be completed by you";
		public static final String STUDENT_EVALUATION_STATUS_SUBMITTED = "You have submitted your feedback for this evaluation";
		public static final String STUDENT_EVALUATION_STATUS_CLOSED = "The evaluation has finished but the instructor has not published the results yet";
		public static final String STUDENT_EVALUATION_STATUS_PUBLISHED = "The evaluation has finished and you can check the results";
		public static final String STUDENT_EVALUATION_STATUS_ERROR = "There were some errors in retrieving this evaluation.";
	
		public static final String STUDENT_FEEDBACK_SESSION_STATUS_PENDING = "The feedback session is yet to be completed by you.";
		public static final String STUDENT_FEEDBACK_SESSION_STATUS_SUBMITTED = "You have submitted your feedback for this session.";
		public static final String STUDENT_FEEDBACK_SESSION_STATUS_CLOSED = "<br />The session is now closed for submissions.";
		public static final String STUDENT_FEEDBACK_SESSION_STATUS_PUBLISHED = "<br />The responses for the session can now be viewed.";
	
		public static final String FEEDBACK_SESSION_COURSE = "Please select the course for which the feedback session is to be created.";
		public static final String FEEDBACK_SESSION_INPUT_NAME = "Enter the name of the feedback session e.g. Feedback Session 1.";
		public static final String FEEDBACK_SESSION_STARTDATE = "Please select the date and time for which users can start submitting responses for the feedback session.";
		public static final String FEEDBACK_SESSION_ENDDATE = "Please select the date and time for which the feedback session will no longer accept submissions from users.";
		public static final String FEEDBACK_SESSION_VISIBLEDATE = "Select this option to enter in a custom date and time for which the feedback session will become visible.<br />"
				+ "Note that you can make a session visible before it is open for submissions so that users can preview the questions.";
		public static final String FEEDBACK_SESSION_PUBLISHDATE = "Select this option to enter in a custom date and time for which</br>"
				+ "the responses for this feedback session will become visible.";
		public static final String FEEDBACK_SESSION_SESSIONVISIBLELABEL = "Please select when you want the questions for the feedback session to be visible to users who need to participate.<br />Note that users cannot submit their responses until the submissions opening time set below.";
		public static final String FEEDBACK_SESSION_SESSIONVISIBLECUSTOM = "Select this option to use a custom time for when the session will become visible to users. ";
		public static final String FEEDBACK_SESSION_SESSIONVISIBLEATOPEN = "Select this option to have the feedback session become visible<br />"
				+ "when it is open for submissions (as selected below).";
		public static final String FEEDBACK_SESSION_SESSIONVISIBLENEVER = "Select this option if you want the feedback session to never be visible.<br />"
				+ "Use this option if you want to use this as a private feedback session.";
		public static final String FEEDBACK_SESSION_RESULTSVISIBLELABEL = "Please select when the responses for the feedback session will be visible to the designated recipients."
				+ "<br />You can select the response visibility for each type of user and question later.";
		public static final String FEEDBACK_SESSION_RESULTSVISIBLECUSTOM = "Select this option to use a custom time for when the responses of the feedback session<br />"
				+ "will be visible to the designated recipients.";
		public static final String FEEDBACK_SESSION_RESULTSVISIBLEATVISIBLE = "Select this option to have the feedback responses be immediately visible<br />"
				+ "when the session becomes visible to users.";
		public static final String FEEDBACK_SESSION_RESULTSVISIBLELATER = "Select this option if you intend to choose when the responses will be visible at a later time.";
		public static final String FEEDBACK_SESSION_RESULTSVISIBLENEVER = "Select this option if you intend never to publish the responses.";
		public static final String FEEDBACK_SESSION_INSTRUCTIONS = "Enter instructions for this feedback session. e.g. Avoid comments which are too critical.<br /> It will be displayed at the top of the page when users respond to the session.";
		public static final String FEEDBACK_SESSION_STATUS_VISIBLE = ", is visible";
		public static final String FEEDBACK_SESSION_STATUS_AWAITING = ", and is waiting to open";
		public static final String FEEDBACK_SESSION_STATUS_OPEN = ", and is open for submissions";
		public static final String FEEDBACK_SESSION_STATUS_CLOSED = ", and has ended";
		public static final String FEEDBACK_SESSION_STATUS_PUBLISHED = ".<br />The responses for this session are visible";
		
		public static final String FEEDBACK_SESSION_RESULTS = "View the submitted responses for this feedback session";
		public static final String FEEDBACK_SESSION_EDIT = "Edit feedback session details";
		public static final String FEEDBACK_SESSION_DELETE = "Delete the feedback session";
		public static final String FEEDBACK_SESSION_SUBMIT = "Start submitting feedback";
		public static final String FEEDBACK_SESSION_EDIT_RESPONSE = "View/Edit submitted feedback";

		public static final String FEEDBACK_QUESTION_INPUT_INSTRUCTIONS = "Please enter the question for users to give feedback about. e.g. What is the biggest weakness of the presented product?";
		public static final String FEEDBACK_QUESTION_EDIT = "Edit this question";
		public static final String FEEDBACK_QUESTION_DELETE = "Delete this question";
		public static final String FEEDBACK_QUESTION_VISBILITY = "Here you can select how each question's response will be visible to the different types of users in your course.";
	
		public static final String FEEDBACK_RESPONSE_VISIBILITY_INFO = "Here you can see the visibility of your feedback to the various users" +
				"<br />in the course once the results are published.";
		public static final String FEEDBACK_RESPONSE_SAVE = "You can submit your responses at any time and come back later to continue " +
				"before the session closes.";
	}

	public class ParamsNames{
		public static final String COURSE_ID = "courseid";
		public static final String COURSE_NAME = "coursename";
		public static final String COURSE_INSTRUCTOR_LIST = "instructorlist";
		public static final String INSTRUCTOR_ID = "instructorid";
		public static final String INSTRUCTOR_EMAIL = "instructoremail";
		public static final String INSTRUCTOR_INSTITUTION = "instructorinstitution";
		public static final String INSTRUCTOR_NAME = "instructorname";
		public static final String STUDENTS_ENROLLMENT_INFO = "enrollstudents";
		public static final String INSTRUCTOR_IMPORT_SAMPLE = "importsample";
	
		public static final String EVALUATION_NAME = "evaluationname";
	
		public static final String EVALUATION_START = "start";
		public static final String EVALUATION_STARTTIME = "starttime";
		public static final String EVALUATION_DEADLINE = "deadline";
		public static final String EVALUATION_DEADLINETIME = "deadlinetime";
		public static final String EVALUATION_TIMEZONE = "timezone";
	
		public static final String EVALUATION_COMMENTSENABLED = "commentsstatus";
		public static final String EVALUATION_GRACEPERIOD = "graceperiod";
		public static final String EVALUATION_INSTRUCTIONS = "instr";
		public static final String EVALUATION_NUMBEROFCOMPLETEDEVALUATIONS = "numberofevaluations";
		public static final String EVALUATION_NUMBEROFEVALUATIONS = "numberofcompletedevaluations";
		public static final String EVALUATION_PUBLISHED = "published";
		public static final String EVALUATION_TYPE = "evaluationtype";
		
		public static final String FEEDBACK_SESSION_NAME = "fsname";
		public static final String FEEDBACK_SESSION_CREATOR = "fscreator";
		public static final String FEEDBACK_SESSION_CREATEDATE = "createdate";
		public static final String FEEDBACK_SESSION_CREATETIME = "createtime";
		public static final String FEEDBACK_SESSION_STARTDATE = "startdate";
		public static final String FEEDBACK_SESSION_STARTTIME = "starttime";
		public static final String FEEDBACK_SESSION_ENDDATE = "enddate";
		public static final String FEEDBACK_SESSION_ENDTIME = "endtime";
		public static final String FEEDBACK_SESSION_VISIBLEDATE = "visibledate";
		public static final String FEEDBACK_SESSION_VISIBLETIME = "visibletime";
		public static final String FEEDBACK_SESSION_PUBLISHDATE = "publishdate";
		public static final String FEEDBACK_SESSION_PUBLISHTIME = "publishtime";
		public static final String FEEDBACK_SESSION_TIMEZONE = "timezone";
		public static final String FEEDBACK_SESSION_GRACEPERIOD = "graceperiod";
		public static final String FEEDBACK_SESSION_TYPE = "fstype";
		public static final String FEEDBACK_SESSION_OPENEMAILSENT = "fsopenemailsent";
		public static final String FEEDBACK_SESSION_PUBLISHEDEMAILSENT = "fspublishedemailsent";
		public static final String FEEDBACK_SESSION_SESSIONVISIBLEBUTTON = "sessionVisibleFromButton";
		public static final String FEEDBACK_SESSION_RESULTSVISIBLEBUTTON = "resultsVisibleFromButton";
		public static final String FEEDBACK_SESSION_INSTRUCTIONS = "instructions";
		
		public static final String FEEDBACK_QUESTION_ID = "questionid";
		public static final String FEEDBACK_QUESTION_NUMBER = "questionnum";
		public static final String FEEDBACK_QUESTION_TEXT = "questiontext";
		public static final String FEEDBACK_QUESTION_TYPE = "questiontype";
		public static final String FEEDBACK_QUESTION_GIVERTYPE = "givertype";
		public static final String FEEDBACK_QUESTION_RECIPIENTTYPE = "recipienttype";
		public static final String FEEDBACK_QUESTION_NUMBEROFENTITIES = "numofrecipients";
		public static final String FEEDBACK_QUESTION_NUMBEROFENTITIESTYPE = "numofrecipientstype";
		public static final String FEEDBACK_QUESTION_EDITTEXT = "questionedittext";
		public static final String FEEDBACK_QUESTION_EDITTYPE = "questionedittype";
		public static final String FEEDBACK_QUESTION_SAVECHANGESTEXT = "questionsavechangestext";
		public static final String FEEDBACK_QUESTION_SHOWRESPONSESTO = "showresponsesto";
		public static final String FEEDBACK_QUESTION_SHOWGIVERTO = "showgiverto";
		public static final String FEEDBACK_QUESTION_SHOWRECIPIENTTO = "showrecipientto";
		public static final String FEEDBACK_QUESTION_RESPONSETOTAL = "questionresponsetotal";
	
		public static final String FEEDBACK_RESPONSE_ID = "responseid";
		public static final String FEEDBACK_RESPONSE_RECIPIENT = "responserecipient";
		public static final String FEEDBACK_RESPONSE_TEXT = "responsetext";
		
		public static final String FEEDBACK_RESULTS_UPLOADDOWNLOADBUTTON = "fruploaddownloadbtn";
		public static final String FEEDBACK_RESULTS_SORTTYPE = "frsorttype";
		
		public static final String STUDENT_ID = "googleid";
	
		public static final String REGKEY = "regkey";
		public static final String STUDENT_EMAIL = "studentemail";
		public static final String NEW_STUDENT_EMAIL = "newstudentemail";
	
		public static final String STUDENT_NAME = "studentname";
		public static final String FROM_EMAIL = "fromemail";
		public static final String TO_EMAIL = "toemail";
		public static final String TEAM_NAME = "teamname";
		public static final String POINTS = "points";
		public static final String JUSTIFICATION = "justification";
		public static final String COMMENTS = "comments";
		public static final String TEAMMATES = "teammates";
	
		public static final String STATUS_MESSAGE = "message";
		public static final String ERROR = "error";
		public static final String NEXT_URL = "next";
		public static final String USER_ID = "user";
	
		public static final String LOGIN_ADMIN = "admin";
		public static final String LOGIN_INSTRUCTOR = "instructor";
		public static final String LOGIN_STUDENT = "student";
	}

	public class ActionURIs{
		
		/* _PAGE/Page in the Action URI name means 'show page' */
	
		public static final String LOGIN = "/login";
	
		public static final String INSTRUCTOR_HOME_PAGE = "/page/instructorHomePage";
		public static final String INSTRUCTOR_COURSES_PAGE = "/page/instructorCoursesPage";
		public static final String INSTRUCTOR_COURSE_ADD = "/page/instructorCourseAdd";
		public static final String INSTRUCTOR_COURSE_DELETE = "/page/instructorCourseDelete";
		public static final String INSTRUCTOR_COURSE_DETAILS_PAGE = "/page/instructorCourseDetailsPage";
		public static final String INSTRUCTOR_COURSE_EDIT_PAGE = "/page/instructorCourseEditPage";
		public static final String INSTRUCTOR_COURSE_EDIT_SAVE = "/page/instructorCourseEditSave";
		public static final String INSTRUCTOR_COURSE_STUDENT_DETAILS_PAGE = "/page/instructorCourseStudentDetailsPage";
		public static final String INSTRUCTOR_COURSE_STUDENT_DETAILS_EDIT = "/page/instructorCourseStudentDetailsEdit";
		public static final String INSTRUCTOR_COURSE_STUDENT_DETAILS_EDIT_SAVE = "/page/instructorCourseStudentDetailsEditSave";
		public static final String INSTRUCTOR_COURSE_STUDENT_DELETE = "/page/instructorCourseStudentDelete";
		public static final String INSTRUCTOR_COURSE_ENROLL_PAGE = "/page/instructorCourseEnrollPage";
		public static final String INSTRUCTOR_COURSE_ENROLL_SAVE = "/page/instructorCourseEnrollSave";
		public static final String INSTRUCTOR_COURSE_REMIND = "/page/instructorCourseRemind";
		public static final String INSTRUCTOR_EVALS_PAGE = "/page/instructorEvalsPage";
		public static final String INSTRUCTOR_EVAL_ADD = "/page/instructorEvalAdd";
		public static final String INSTRUCTOR_EVAL_DELETE = "/page/instructorEvalDelete";
		public static final String INSTRUCTOR_EVAL_EDIT_PAGE = "/page/instructorEvalEditPage";
		public static final String INSTRUCTOR_EVAL_EDIT_SAVE = "/page/instructorEvalEditSave";
		public static final String INSTRUCTOR_EVAL_RESULTS_PAGE = "/page/instructorEvalResultsPage";
		public static final String INSTRUCTOR_EVAL_SUBMISSION_PAGE = "/page/instructorEvalSubmissionPage";
		public static final String INSTRUCTOR_EVAL_SUBMISSION_EDIT = "/page/instructorEvalSubmissionEdit";
		public static final String INSTRUCTOR_EVAL_SUBMISSION_EDIT_SAVE = "/page/instructorEvalSubmissionEditSave";
		public static final String INSTRUCTOR_EVAL_REMIND = "/page/instructorEvalRemind";
		public static final String INSTRUCTOR_EVAL_PUBLISH = "/page/instructorEvalPublish";
		public static final String INSTRUCTOR_EVAL_UNPUBLISH = "/page/instructorEvalUnpublish";
		public static final String INSTRUCTOR_EVAL_RESULTS_DOWNLOAD = "/page/instructorEvalResultsDownload";
		
		public static final String INSTRUCTOR_FEEDBACKS_PAGE = "/page/instructorFeedbacksPage";
		public static final String INSTRUCTOR_FEEDBACK_ADD = "/page/instructorFeedbackAdd";
		public static final String INSTRUCTOR_FEEDBACK_DELETE = "/page/instructorFeedbackDelete";
		public static final String INSTRUCTOR_FEEDBACK_EDIT_PAGE = "/page/instructorFeedbackEditPage";
		public static final String INSTRUCTOR_FEEDBACK_EDIT_SAVE = "/page/instructorFeedbackEditSave";
		public static final String INSTRUCTOR_FEEDBACK_RESULTS_PAGE = "/page/instructorFeedbackResultsPage";
		public static final String INSTRUCTOR_FEEDBACK_RESULTS_DOWNLOAD = "/page/instructorFeedbackResultsDownload";
		
		public static final String INSTRUCTOR_FEEDBACK_QUESTION_ADD = "/page/instructorFeedbackQuestionAdd";
		public static final String INSTRUCTOR_FEEDBACK_QUESTION_EDIT = "/page/instructorFeedbackQuestionEdit";
		
		public static final String STUDENT_HOME_PAGE = "/page/studentHomePage";
		public static final String STUDENT_COURSE_JOIN = "/page/studentCourseJoin";
		public static final String STUDENT_COURSE_DETAILS_PAGE = "/page/studentCourseDetailsPage";
		public static final String STUDENT_EVAL_SUBMISSION_EDIT_PAGE = "/page/studentEvalSubmissionEditPage";
		public static final String STUDENT_EVAL_SUBMISSION_EDIT_SAVE = "/page/studentEvalSubmissionEditSave";
		public static final String STUDENT_EVAL_RESULTS_PAGE = "/page/studentEvalResultsPage";
		
		public static final String STUDENT_FEEDBACK_SUBMISSION_EDIT_PAGE = "/page/studentFeedbackSubmissionEditPage";
		public static final String STUDENT_FEEDBACK_SUBMISSION_EDIT_SAVE = "/page/studentFeedbackSubmissionEditSave";
		public static final String STUDENT_FEEDBACK_RESULTS_PAGE = "/page/studentFeedbackResultsPage";
		
		public static final String ADMIN_HOME_PAGE = "/admin/adminHomePage";
		public static final String ADMIN_INSTRUCTORACCOUNT_ADD = "/admin/adminInstructorAccountAdd";
		public static final String ADMIN_ACCOUNT_MANAGEMENT_PAGE = "/admin/adminAccountManagementPage";
		public static final String ADMIN_ACCOUNT_DETAILS_PAGE = "/admin/adminAccountDetailsPage";
		public static final String ADMIN_ACCOUNT_DELETE = "/admin/adminAccountDelete";
		public static final String ADMIN_EXCEPTION_TEST = "/admin/adminExceptionTest";
		public static final String ADMIN_ACTIVITY_LOG_PAGE = "/admin/adminActivityLogPage";
		public static final String ADMIN_SEARCH_PAGE = "/admin/adminSearchPage";
		
		public static final String AUTOMATED_EVAL_OPENING_REMINDERS = "/evaluationopeningreminders";
		public static final String AUTOMATED_EVAL_CLOSING_REMINDERS = "/evaluationclosingreminders";
		
		public static final String BACKDOOR = "/backdoor";
	}

	public class ViewURIs{
		
		/* We omit adding the 'page' prefix to views because all of them are "pages" */
	
		public static final String INSTRUCTOR_HOME = "/jsp/instructorHome.jsp"; 
		public static final String INSTRUCTOR_COURSES = "/jsp/instructorCourses.jsp"; 
		public static final String INSTRUCTOR_COURSE_EDIT = "/jsp/instructorCourseEdit.jsp"; 
		public static final String INSTRUCTOR_COURSE_DETAILS = "/jsp/instructorCourseDetails.jsp"; 
		public static final String INSTRUCTOR_COURSE_STUDENT_DETAILS = "/jsp/instructorCourseStudentDetails.jsp"; 
		public static final String INSTRUCTOR_COURSE_STUDENT_EDIT = "/jsp/instructorCourseStudentEdit.jsp"; 
		public static final String INSTRUCTOR_COURSE_ENROLL = "/jsp/instructorCourseEnroll.jsp"; 
		public static final String INSTRUCTOR_COURSE_ENROLL_RESULT = "/jsp/instructorCourseEnrollResult.jsp"; 
		public static final String INSTRUCTOR_EVALS = "/jsp/instructorEvals.jsp"; 
		public static final String INSTRUCTOR_EVAL_EDIT = "/jsp/instructorEvalEdit.jsp"; 
		public static final String INSTRUCTOR_EVAL_RESULTS = "/jsp/instructorEvalResults.jsp"; 
		public static final String INSTRUCTOR_EVAL_SUBMISSION = "/jsp/instructorEvalSubmission.jsp"; 
		public static final String INSTRUCTOR_EVAL_SUBMISSION_EDIT = "/jsp/instructorEvalSubmissionEdit.jsp"; 
		public static final String INSTRUCTOR_FEEDBACKS = "/jsp/instructorFeedbacks.jsp";
		public static final String INSTRUCTOR_FEEDBACK_EDIT = "/jsp/instructorFeedbackEdit.jsp";
		public static final String INSTRUCTOR_FEEDBACK_RESULTS_TOP = "/jsp/instructorFeedbackResultsTop.jsp";
		public static final String INSTRUCTOR_FEEDBACK_RESULTS_BY_GIVER = "/jsp/instructorFeedbackResultsByGiver.jsp";
		public static final String INSTRUCTOR_FEEDBACK_RESULTS_BY_RECIPIENT = "/jsp/instructorFeedbackResultsByRecipient.jsp"; 
		public static final String INSTRUCTOR_FEEDBACK_RESULTS_BY_TABLE = "/jsp/instructorFeedbackResultsByTable.jsp"; 
	
		public static final String STUDENT_HOME = "/jsp/studentHome.jsp"; 
		public static final String STUDENT_COURSE_DETAILS = "/jsp/studentCourseDetails.jsp"; 
		public static final String STUDENT_EVAL_SUBMISSION_EDIT = "/jsp/studentEvalEdit.jsp"; 
		public static final String STUDENT_EVAL_RESULTS = "/jsp/studentEvalResults.jsp"; 
		public static final String STUDENT_FEEDBACK_SUBMISSION_EDIT = "/jsp/studentFeedbackSubmissionEdit.jsp"; 
		public static final String STUDENT_FEEDBACK_RESULTS = "/jsp/studentFeedbackResults.jsp"; 
	
		public static final String ADMIN_HOME = "/jsp/adminHome.jsp";
		public static final String ADMIN_ACCOUNT_MANAGEMENT = "/jsp/adminAccountManagement.jsp";
		public static final String ADMIN_SEARCH = "/jsp/adminSearch.jsp";
		public static final String ADMIN_ACTIVITY_LOG = "/jsp/adminActivityLog.jsp";
		public static final String ADMIN_ACCOUNT_DETAILS = "/jsp/adminAccountDetails.jsp";
		
		public static final String LOGOUT = "/logout.jsp"; 
		
		
		public static final String SHOW_MESSAGE = "/showMessage.jsp"; 
		public static final String UNAUTHORIZED = "/unauthorized.jsp"; 
		public static final String ERROR_PAGE = "/errorPage.jsp"; 
		public static final String DEADLINE_EXCEEDED_ERROR_PAGE = "/deadlineExceededErrorPage.jsp"; 
		public static final String ENTITY_NOT_FOUND_PAGE = "/entityNotFoundPage.jsp"; 
		public static final String ACTION_NOT_FOUND_PAGE = "/pageNotFound.jsp"; 
		
		public static final String MASHUP = "/dev/mashup.jsp";
	
		//View fragments
		public static final String INSTRUCTOR_HEADER = "/jsp/instructorHeader.jsp"; 
		public static final String STUDENT_HEADER = "/jsp/studentHeader.jsp"; 
		public static final String ADMIN_HEADER = "/jsp/adminHeader.jsp"; 
		public static final String FOOTER = "/jsp/footer.jsp"; 
		public static final String STATUS_MESSAGE = "/jsp/statusMessage.jsp"; 
		public static final String EVAL_SUBMISSION_EDIT = "/jsp/evalSubmissionEdit.jsp"; 
	}

	/* These are status messages that may be shown to the user */
	public class StatusMessages{
		public static final String LOADING = "<img src=\"/images/ajax-loader.gif\" /><br />";
		public static final String STUDENT_FIRST_TIME = "Welcome stranger :-) "
				+ "<br/><br/>It seems you are not a registered user of TEAMMATES. To use TEAMMATES, a course instructor has to add you to a course first. "
				+ "After that, TEAMMATES will send you an email containing the link to 'join' that course. "
				+ "<br/><br/>If you already clicked on such a link and ended up here, it is likely that your email software messed up the link. Please retry to join by filling in the above box the registration key given in that same e-mail."
				+ "If you still cannot join, feel free to <a href='http://www.comp.nus.edu.sg/%7Eteams/contact.html'>contact us</a> for help. "
				+ "<br/><br/>Not a stranger to TEAMMATES? Could log in before, but not any more? That can happen if you changed the primary email from a non-Gmail address to a Gmail address recently. " 
				+ "<br/>In that case, <a href='http://www.comp.nus.edu.sg/%7Eteams/contact.html'>email us</a> so that we can reconfigure your account to use the new Gmail address. ";
		
		public static final String COURSE_ADDED = "The course has been added. Click the 'Enroll' link in the table below to add students to the course. If you don't see the course in the list below, please refresh the page after a few moments.";
		public static final String COURSE_EXISTS = "A course by the same ID already exists in the system, possibly created by another user. Please choose a different course ID";
		public static final String COURSE_EDITED = "The course has been edited.";
		public static final String COURSE_DELETED = "The course has been deleted.";
		public static final String COURSE_EMPTY = "You have not created any courses yet. Use the form above to create a course.";
		public static final String COURSE_EMPTY_IN_EVALUATION = "You have not created any courses yet. Go <a href=\""
				+ ActionURIs.INSTRUCTOR_COURSES_PAGE + "${user}\">here</a> to create one.";
		public static final String COURSE_REMINDER_SENT_TO = "Registration key has been sent to ";
		public static final String COURSE_REMINDERS_SENT = "Emails have been sent to unregistered students.";
	
		public static final String STUDENT_EDITED = "The student has been edited successfully";
		public static final String STUDENT_DELETED = "The student has been removed from the course";
	
		public static final String EVALUATION_ADDED = "The evaluation has been added. If you don't see that evaluation in the list below, please refresh the page after a few moments.";
		public static final String EVALUATION_DELETED = "The evaluation has been deleted.";
		public static final String EVALUATION_EDITED = "The evaluation has been edited.";
		public static final String EVALUATION_INFORMEDSTUDENTSOFCHANGES = "E-mails have been sent out to inform the students of the changes to the evaluation.";
		public static final String EVALUATION_PUBLISHED = "The evaluation has been published.";
		public static final String EVALUATION_UNPUBLISHED = "The evaluation has been unpublished.";
		public static final String EVALUATION_REMINDERSSENT = "Reminder e-mails have been sent out to those students.";
		public static final String EVALUATION_RESULTSEDITED = "The particular evaluation results have been edited.";
		public static final String EVALUATION_EMPTY = "You have not created any evaluations yet. Use the form above to create a new evaluation.";
		public static final String EVALUATION_NOT_OPEN = "This evaluation is not open at this time. You are not allowed to edit your submission.";
		public static final String EVALUATION_EXISTS = "An evaluation by this name already exists under this course";
		
		public static final String FEEDBACK_SESSION_ADDED = "The feedback session has been added. Click the \"Add New Question\" button below to begin adding questions for the feedback session.";
		public static final String FEEDBACK_SESSION_EDITED = "The feedback session has been updated.";
		public static final String FEEDBACK_SESSION_DELETED = "The feedback session has been deleted.";
		public static final String FEEDBACK_SESSION_EXISTS = "A feedback session by this name already exists under this course";
		public static final String FEEDBACK_SESSION_EMPTY = "You have not created any feedback sessions yet. Use the form above to create a new feedback session.";
	
		public static final String FEEDBACK_QUESTION_ADDED = "The question has been added to this feedback session.";
		public static final String FEEDBACK_QUESTION_EDITED = "The changes to the question has been updated.";
		public static final String FEEDBACK_QUESTION_DELETED = "The question has been deleted.";
		public static final String FEEDBACK_QUESTION_EXISTS = "The requested question has already been created.";
		public static final String FEEDBACK_QUESTION_EMPTY = "You have not created any questions for this feedback session yet. Click the button below to add a feedback question.";
		public static final String FEEDBACK_QUESTION_NUMBEROFENTITIESINVALID = "Please enter the maximum number of recipients each respondants should give feedback to.";
		public static final String FEEDBACK_QUESTION_TEXTINVALID = "Please enter a valid question. The question text cannot be empty.";
		
		public static final String FEEDBACK_RESPONSES_SAVED = "All responses submitted succesfully!";
		
		public static final String FEEDBACK_SUBMISSIONS_NOT_YET_OPEN = "You can view the questions for this feedback session but cannot submit responses yet as the session is not yet opened.";
		public static final String FEEDBACK_SUBMISSIONS_CLOSED = "You can view the questions for this feedback session and any previously submitted responses but cannot further edit them as the session is already closed.";
		
		//TODO: these status messages are from used for input validation testing only. Move to test driver side? 
		
		public static final String COURSE_INPUT_FIELDS_EXTRA = "There are too many fields.";
		public static final String COURSE_INPUT_FIELDS_MISSING = "There are missing fields.";
		public static final String COURSE_GOOGLEID_INVALID = "GoogleID should only consist of alphanumerics, fullstops, dashes or underscores.";
		public static final String COURSE_EMAIL_INVALID = "The e-mail address is invalid.";
		public static final String COURSE_INSTRUCTORNAME_INVALID = "Name should only consist of alphanumerics or hyphens, apostrophes, fullstops, commas, slashes, round brackets\nand not more than 40 characters.";
		public static final String COURSE_COURSE_ID_EMPTY = "Course ID cannot be empty.";
		public static final String COURSE_COURSE_NAME_EMPTY = "Course name cannot be empty";
		public static final String COURSE_INSTRUCTOR_LIST_EMPTY = "Instructor list cannot be empty";
		public static final String COURSE_INVALID_ID = "Please use only alphabets, numbers, dots, hyphens, underscores and dollar signs in course ID.";
		
		public static final String EVALUATION_NAMEINVALID = "Please use only alphabets, numbers and whitespace in evaluation name.";
		public static final String EVALUATION_NAME_LENGTHINVALID = "Evaluation name should not exceed 38 characters.";
		public static final String EVALUATION_SCHEDULEINVALID = "The evaluation schedule (start/deadline) is not valid.<br />"
				+ "The start time should be in the future, and the deadline should be after start time.";
		public static final String FIELDS_EMPTY = "Please fill in all the relevant fields.";
	
		public static final String FEEDBACK_SESSION_NAME_INVALID = "Please use only alphabets, numbers and whitespace in feedback session name.";
		public static final String FEEDBACK_SESSION_NAME_LENGTHINVALID = "Feedback session name should not exceed 38 characters.";
		public static final String FEEDBACK_SESSION_SCHEDULEINVALID = "The feedback sesion schedule (start/end) is not valid.<br />"
				+ "The start time should be in the future, and the end time should be after start time.";
		
		public static final String INSTRUCTOR_STATUS_DELETED = "The Instructor status has been deleted";
		public static final String INSTRUCTOR_ACCOUNT_DELETED = "The Account has been deleted";
		public static final String INSTRUCTOR_REMOVED_FROM_COURSE = "The Instructor has been removed from the Course";
		
		// Messages that are templates only
		/** Template String. Parameters: Student's name, Evaluation name, Course ID */
		public static final String INSTRUCTOR_EVALUATION_SUBMISSION_RECEIVED = "You have edited %s's submission for evaluation %s in course %s successfully.<br />"
				+ "The change will not be reflected here until you <span class='color_red bold'>REFRESH</span> the page.";
		/** Template String. Parameters: Evaluation name, Course ID */
		public static final String STUDENT_EVALUATION_SUBMISSION_RECEIVED = "Your submission for %s in course %s has been saved successfully";
	}

	/* These indicate status of an operation, but they are not shown to the user */
	public class StatusCodes{
	
		// Backdoor responses
		public static final String BACKDOOR_STATUS_SUCCESS = "[BACKDOOR_STATUS_SUCCESS]";
		public static final String BACKDOOR_STATUS_FAILURE = "[BACKDOOR_STATUS_FAILURE]";
	
		// General Error codes
		public static final String ACTIVATED_BEFORE_START = "ERRORCODE_ACTIVATED_BEFORE_START";
		public static final String ALREADY_JOINED = "ERRORCODE_ALREADY_JOINED";
		public static final String EMPTY_STRING = "ERRORCODE_EMPTY_STRING";
		public static final String END_BEFORE_START = "ERRORCODE_END_BEFORE_START";
		public static final String NULL_PARAMETER = "ERRORCODE_NULL_PARAMETER";
		public static final String INCORRECTLY_FORMATTED_STRING = "ERRORCODE_INCORRECTLY_FORMATTED_STRING";
		public static final String INVALID_CHARS = "ERRORCODE_IVALID_CHARS";
		public static final String INVALID_EMAIL = "ERRORCODE_INVALID_EMAIL";
		public static final String INVALID_KEY = "ERRORCODE_INVALID_KEY";
		public static final String KEY_BELONGS_TO_DIFFERENT_USER = "ERRORCODE_KEY_BELONGS_TO_DIFFERENT_USER";
		public static final String LEADING_OR_TRAILING_SPACES = "ERRORCODE_LEADING_OR_TRAILING_SPACES";
		public static final String PUBLISHED_BEFORE_CLOSING = "ERRORCODE_PUBLISHED_BEFORE_CLOSING";
		public static final String STRING_TOO_LONG = "ERRORCODE_STRING_TOO_LONG";
		public static final String UNPUBLISHED_BEFORE_PUBLISHING = "ERRORCODE_UNPUBLISHED_BEFORE_PUBLISHING";
		
		// Error message used across DB level
		public static final String DBLEVEL_NULL_INPUT = "Supplied parameter was null\n";
	}

	/* This section holds constants that are defined as constants primarily 
	 * because they are repeated in many places.
	 */
	@SuppressWarnings("unused")
	private void _______repeated_phrases___________________________________(){}
	
	public static final String EOL = System.getProperty("line.separator");
	
	public static final String TEAM_OF_EMAIL_OWNER = "'s Team";
	
	public static final String INSTRUCTOR_EVALUATION_STATUS_AWAITING = "Awaiting";
	public static final String INSTRUCTOR_EVALUATION_STATUS_OPEN = "Open";
	public static final String INSTRUCTOR_EVALUATION_STATUS_CLOSED = "Closed";
	public static final String INSTRUCTOR_EVALUATION_STATUS_PUBLISHED = "Published";

	public static final String STUDENT_EVALUATION_STATUS_PENDING = "Pending";
	public static final String STUDENT_EVALUATION_STATUS_SUBMITTED = "Submitted";
	public static final String STUDENT_EVALUATION_STATUS_CLOSED = "Closed";
	public static final String STUDENT_EVALUATION_STATUS_PUBLISHED = "Published";
	public static final String STUDENT_EVALUATION_STATUS_ERROR = "Error";

	public static final String STUDENT_COURSE_STATUS_YET_TO_JOIN = "Yet to join";
	public static final String STUDENT_COURSE_STATUS_JOINED = "Joined";
	
	public static String ACTION_RESULT_FAILURE = "Servlet Action Failure";
	public static String ACTION_RESULT_SYSTEM_ERROR_REPORT = "System Error Report";

	/* These constants are used as variable values to mean that the variable 
	 * is in a 'special' state.
	 */
	@SuppressWarnings("unused")
	private void _______values_with_special_meanings________________________(){}
	
	public static final int INT_UNINITIALIZED = -9999;
	public static final double DOUBLE_UNINITIALIZED = -9999.0;
	
	public static final int MAX_POSSIBLE_RECIPIENTS = -100;
	
	public static final int POINTS_NOT_SURE = -101;
	public static final int POINTS_NOT_SUBMITTED = -999;
	
	public static final String GENERAL_QUESTION = "%GENERAL%";
	public static final String USER_IS_TEAM = "%TEAM%";
	public static final String USER_IS_NOBODY = "%NOBODY%";
	
	public static final Date TIME_REPRESENTS_FOLLOW_OPENING;
	public static final Date TIME_REPRESENTS_FOLLOW_VISIBLE;
	public static final Date TIME_REPRESENTS_NEVER;
	public static final Date TIME_REPRESENTS_LATER;
	
	static {
		//TODO: Can be simplified using TimeHelper
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		calendar.clear();
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(1970, 11, 31);
		TIME_REPRESENTS_FOLLOW_OPENING = calendar.getTime();
		calendar.set(1970, 05, 22);
		TIME_REPRESENTS_FOLLOW_VISIBLE = calendar.getTime();
		calendar.set(1970, 10, 27);
		TIME_REPRESENTS_NEVER = calendar.getTime();
		calendar.set(1970, 00, 01);
		TIME_REPRESENTS_LATER = calendar.getTime();
	}
 	
}