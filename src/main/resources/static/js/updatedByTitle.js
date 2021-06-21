const updatedReportTitleSearch = document.querySelector("#updatedTitleInput")
const updatedReportTitleSubmit = document.querySelector("#updatedTitleSubmitButton")
updatedReportTitleSubmit.addEventListener("click", () => {
    window.location.href ="http://localhost:8080/found_updated_report?title=" + updatedReportTitleSearch.value;
})