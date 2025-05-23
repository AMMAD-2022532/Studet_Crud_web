document.addEventListener('DOMContentLoaded', function () {
  const searchInput = document.getElementById('searchInput');
  const table = document.getElementById('studentTable');
  const tbody = table ? table.tBodies[0] : null;
  const rows = tbody ? Array.from(tbody.rows) : [];

  if (searchInput) {
    searchInput.addEventListener('input', () => {
      const filter = searchInput.value.trim().toLowerCase();
      rows.forEach(row => {
        row.style.display = row.textContent.toLowerCase().includes(filter) ? '' : 'none';
      });
    });
  }

  const deleteBtns = document.querySelectorAll('.delete-btn');
  const modal = document.getElementById('confirmModal');
  const yesBtn = document.getElementById('confirmYes');
  const noBtn = document.getElementById('confirmNo');
  let deleteUrl = '';

  deleteBtns.forEach(btn => {
    btn.addEventListener('click', e => {
      e.preventDefault();
      deleteUrl = btn.getAttribute('data-href');
      modal.style.display = 'flex';
    });
  });

  if (yesBtn) {
    yesBtn.addEventListener('click', () => {
      if (deleteUrl) {
        window.location.href = deleteUrl;
      }
    });
  }

  if (noBtn) {
    noBtn.addEventListener('click', () => {
      modal.style.display = 'none';
      deleteUrl = '';
    });
  }
});
