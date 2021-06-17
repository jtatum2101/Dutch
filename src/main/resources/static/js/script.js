const dateSearch = document.querySelector("#dateInput")
const submitButton = document.querySelector("#submitButton")
submitButton.addEventListener("click", () => {
    window.location.href="http://localhost:8080/found_report_by_date?date=" + dateSearch.value;
})