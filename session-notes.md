# Session Notes

## Summary

- Fixed and styled JSF student form/response pages; ensured bindings use `student.*` fields.
- Applied full 1990s retro UI theme: beveled window frame, toolbar with faux icons, tiled background, marquee-style header, inset inputs, and classic link colors.
- Expanded the student form to include: age, date of birth, email, major/program, and academic year; updated response page to display these fields.
- Added a mobile layout that stacks labels above fields on small screens.

## Files Updated

- `WebContent/pages/student_form.xhtml`
  - Added CSS include, retro window bar and toolbar, marquee header.
  - Added input fields for age, dob, email, major, year.
- `WebContent/pages/student_response.xhtml`
  - Added CSS include, retro window bar and toolbar, marquee header.
  - Displayed age, dob, email, major, year.
- `WebContent/resources/css/styles.css`
  - Replaced modern styling with 90s theme; added toolbar, window buttons, tiled background, marquee animation.
  - Added mobile layout stacking for panelGrid.
- `src/com/hello/Student.java`
  - Added fields + getters/setters for age, dob, email, major, year.

## Notes

- The binding is `#{student.*}` (not `studentForm`).
- If navigation is a redirect and values disappear, consider longer scope.

## Next Ideas

1. Add basic validation or helper text for age/dob/email.
2. Replace ASCII toolbar icons with a sprite for extra authenticity.

---

## Notes - January 28, 2026

### January 28, 2026

- Added JSF resource bundle support: created `src/form.properties` and registered it in `WebContent/WEB-INF/faces-config.xml`.
- Added CDI activator `WebContent/WEB-INF/beans.xml` (bean-discovery-mode `annotated`).
- Reviewed `student-form-two.xhtml` / `student-response-two.xhtml` and fixed layout by switching `h:panelGrid` to 2 columns.
- Confirmed project uses JSF 2.2.8 (`javax.faces`) from `WebContent/WEB-INF/lib`.

### `f:loadBundle`

`f:loadBundle` is not required IF you have defined the properties file in your `WEB-INF\faces.config.xml` file. Otherwise, you would need it if you hadn't defined it.

### Application Scoped / Managed Beans -- JSF vs. Jakarta

For legacy JSF Applications (non-Jakarta EE ones), you use `import javax.faces.bean.ApplicationScoped` for Application Scoped. Importing a JAR file (e.g., `javax.annotation.jar`) is not required. Newer Jakarta applications use **CDI Libraries**, so you would need a JAR file for this API. With this added extension library / dependency, you could just use `@ApplicationScoped` in your class + `@Named` -- which replaces `@ManagedBean` entirely. No import statements needed.

- See the png "`jakarta-cdi-modern-1.png`"
