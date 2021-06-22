  const deleteReportTitleSearch = document.querySelector("#deleteTitleInput")
  const deleteReportTitleSubmit = document.querySelector("#deleteTitleSubmitButton")
  deleteReportTitleSubmit.addEventListener("click", () => {
      window.location.href ="http://localhost:8080/found_delete_report?title=" + deleteReportTitleSearch.value;
  })