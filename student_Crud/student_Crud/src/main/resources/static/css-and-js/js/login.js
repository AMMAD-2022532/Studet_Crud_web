document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('loginForm');
  
  

  form.addEventListener('submit', event => {
    event.preventDefault();
    clearErrors();
    

    let valid = true;
    ['username','password'].forEach(field => {
      const input = form[field];
      if (!input.value.trim()) {
        showError(field, `${field.charAt(0).toUpperCase()}${field.slice(1)} is required`);
        valid = false;
        
        
      }
    });

    if (valid) {
      const btn = form.querySelector('button[type="submit"]');
      btn.disabled = true;
      btn.textContent = 'Logging in…';
      form.submit();
    }
    
  });

  function showError(field, message) 
  {
    document.querySelector(`.error[data-for="${field}"]`).textContent = message;
  }

  function clearErrors() 
  {
    document.querySelectorAll('.error').forEach(el => el.textContent = '');
  }
});
