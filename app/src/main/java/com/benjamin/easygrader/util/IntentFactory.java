package com.benjamin.easygrader.util;

import android.content.Context;
import android.content.Intent;

import com.benjamin.easygrader.AdminLandingPageActivity;
import com.benjamin.easygrader.EnrollStudentActivity;
import com.benjamin.easygrader.InstructorLandingPageActivity;
import com.benjamin.easygrader.LoginActivity;
import com.benjamin.easygrader.MainActivity;
import com.benjamin.easygrader.ManageAssignmentsActivity;
import com.benjamin.easygrader.ManageCoursesActivity;
import com.benjamin.easygrader.ManageGradesActivity;
import com.benjamin.easygrader.ManageUsersActivity;
import com.benjamin.easygrader.SelectCourseActivity;

public class IntentFactory {

  public static final String USER_ID_EXTRA = "com.benjamin.easygrader.userId";
  public static final String COURSE_ID_EXTRA = "com.benjamin.easygrader.courseId";
  public static final String COURSE_NAME_EXTRA = "com.benjamin.easygrader.courseName";
  public static final String DESTINATION_EXTRA = "com.benjamin.easygrader.destination";

  public static Intent getMainActivityIntent(Context context) {
    Intent intent = new Intent(context, MainActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
    return intent;
  }

  public static Intent getLoginActivityIntent(Context context) {
    return new Intent(context, LoginActivity.class);
  }

  public static Intent getAdminLandingPageActivityIntent(Context context, int userId) {
    Intent intent = new Intent(context, AdminLandingPageActivity.class);
    intent.putExtra(USER_ID_EXTRA, userId);
    return intent;
  }

  public static Intent getInstructorLandingPageActivityIntent(Context context, int userId) {
    Intent intent = new Intent(context, InstructorLandingPageActivity.class);
    intent.putExtra(USER_ID_EXTRA, userId);
    return intent;
  }

  public static Intent getSelectCourseActivityIntent(Context context, int userId) {
    Intent intent = new Intent(context, SelectCourseActivity.class);
    intent.putExtra(USER_ID_EXTRA, userId);
    return intent;
  }

  public static Intent getManageUsersActivityIntent(Context context, Destination destination) {
    Intent intent = new Intent(context, ManageUsersActivity.class);
    intent.putExtra(DESTINATION_EXTRA, destination);
    return intent;
  }

  public static Intent getManageCoursesActivityIntent(Context context, Destination destination) {
    Intent intent = new Intent(context, ManageCoursesActivity.class);
    intent.putExtra(DESTINATION_EXTRA, destination);
    return intent;
  }

  public static Intent getEnrollStudentActivityIntent(Context context, int courseId) {
    Intent intent = new Intent(context, EnrollStudentActivity.class);
    intent.putExtra(COURSE_ID_EXTRA, courseId);
    return intent;
  }

  public static Intent getManageAssignmentsActivityIntent(Context context, int courseId, String courseName, Destination destination) {
    Intent intent = new Intent(context, ManageAssignmentsActivity.class);
    intent.putExtra(COURSE_ID_EXTRA, courseId);
    intent.putExtra(COURSE_NAME_EXTRA, courseName);
    intent.putExtra(DESTINATION_EXTRA, destination);
    return intent;
  }

  public static Intent getManageGradesActivityIntent(Context context, int courseId, String courseName, int userId, Destination destination) {
    Intent intent = new Intent(context, ManageGradesActivity.class);
    intent.putExtra(COURSE_ID_EXTRA, courseId);
    intent.putExtra(COURSE_NAME_EXTRA, courseName);
    intent.putExtra(USER_ID_EXTRA, userId);
    intent.putExtra(DESTINATION_EXTRA, destination);
    return intent;
  }
}
