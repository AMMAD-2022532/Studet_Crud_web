function confirmBack() {
  const inputs = document.querySelectorAll("input[type='text'], input[type='number'], input[type='email']");
  let hasChanges = false;

  inputs.forEach(input => {
    const value = input.value.trim();
    if (value !== "" && value !== "0") {
      hasChanges = true;
    }
  });

  if (hasChanges) {
    
    document.getElementById("backConfirmModal").classList.add("show");
    return false; 
  } else {
    window.location.href = "/list";
    return false;
  }
}

function closeBackModal() {
  document.getElementById("backConfirmModal").classList.remove("show");
}

function goBack() {
  window.location.href = "/list";
}
