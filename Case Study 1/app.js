const userNameError = document.getElementById('user-name-error');
const passwordError = document.getElementById('password-error');
const postalCodeError = document.getElementById('postalCode-error');
const nameError = document.getElementById('name-error');
const areaError = document.getElementById('area-error');
const addressError = document.getElementById('address-error');
const telError = document.getElementById('tel-error');
const emailError = document.getElementById('email-error');
const photoError = document.getElementById('photo-error');


function validateName() {
    let Name = document.getElementById("name-input").value;
    const namePattern = /^[a-zA-Z\s]+$/;

    if (Name.length === 0) {
        nameError.innerHTML = 'Name is required';
        return false;
    } else if (!namePattern.test(Name)) {
        nameError.innerHTML = 'Invalid name format';
        return false;
    } else if (userName.length > 20) {
        nameError.innerHTML = 'Name should not exceed 20 characters';
        return false;
    }
    nameError.innerHTML = '';
    return true;
}
function validateUsername() {
    let userName = document.getElementById("user-name-input").value;
    if (userName.length === 0) {
        userNameError.innerHTML = 'Username is required';
        return false;
    } else if (userName.length > 20) {
        userNameError.innerHTML = 'Username should not exceed 20 characters';
        return false;
    } else if (!/^[a-zA-Z0-9]+$/.test(userName)) {
        userNameError.innerHTML = 'Username should only contain alphanumeric characters';
        return false;
    }
    userNameError.innerHTML = '';
    return true;
}


function validatePassword() {
    let password = document.getElementById("password").value;
    const passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$^&*~]).{8,20}$/;

    if (password.length === 0) {
        passwordError.innerHTML = 'Password is required';
        return false;
    } else if (!passwordPattern.test(password)) {
        passwordError.innerHTML = 'Invalid password format';
        return false;
    }
    passwordError.innerHTML = '';
    return true;
}


function validatePostalCode() {
    let postalCode = document.getElementById("postalCode").value;
    const postalCodePattern = /^\d{6}$/;

    if (postalCode.length === 0) {
        postalCodeError.innerHTML = 'Postal Code is required';
        return false;
    } else if (!postalCodePattern.test(postalCode)) {
        postalCodeError.innerHTML = 'Invalid postal code format';
        return false;
    }
    postalCodeError.innerHTML = '';
    return true;
}

function validateArea() {
    let area = document.getElementById("area").value;
    const areaPattern = /^[a-zA-Z\s]+$/;

    if (area.length === 0) {
        areaError.innerHTML = 'Area is required';
        return false;
    } else if (!areaPattern.test(area)) {
        areaError.innerHTML = 'Area should not contain special characters';
        return false;
    }
    areaError.innerHTML = '';
    return true;
}

function validateAddress() {
    let address = document.getElementById("address").value;

    if (address.length === 0) {
        addressError.innerHTML = 'Address is required';
        return false;
    }
    addressError.innerHTML = '';
    return true;
}

function validatePhone() {
    let phone = document.getElementById("phone").value;
    const phonePattern = /^\d{10}$/;

    if (phone.length === 0) {
        telError.innerHTML = 'Phone number is required';
        return false;
    } else if (!phonePattern.test(phone)) {
        telError.innerHTML = 'Invalid phone number format';
        return false;
    }
    telError.innerHTML = '';
    return true;
}

function validateEmail() {
    let email = document.getElementById("email-input").value;
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

    if (email.length === 0) {
        emailError.innerHTML = 'Email is required';
        return false;
    } else if (!emailPattern.test(email)) {
        emailError.innerHTML = 'Invalid email format';
        return false;
    }
    emailError.innerHTML = '';
    return true;
}

function validatePhoto() {
    let photoInput = document.getElementById("photo");
    let photo = photoInput.files[0]; 
    const allowedFormats = ["jpg", "jpeg", "png", "gif"];
    const maxFileSize = 2097152; // 2MB in bytes

    if (!photo) {
        photoError.innerHTML = 'Photo is required';
        return false;
    }

    const fileExtension = photo.name.split('.').pop().toLowerCase();
    if (!allowedFormats.includes(fileExtension)) {
        photoError.innerHTML = 'Invalid photo format';
        return false;
    }

    const fileSize = photo.size;
    if (fileSize > maxFileSize) {
        photoError.innerHTML = 'Photo size exceeds 2MB';
        return false;
    }

    photoError.innerHTML = '';
    return true;
}



