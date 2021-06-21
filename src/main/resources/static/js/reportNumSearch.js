const reportNumberSearch = document.querySelector("#reportNumInput")
const reportNumSubmit = document.querySelector("#reportNumSubmit")
reportNumSubmit.addEventListener("click", () => {
    window.location.href ="http://localhost:8080/found_report_by_report_num?reportNum=" + reportNumberSearch.value;
})