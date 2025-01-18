import React from 'react';
import './Listpage.css'; // Add styling if needed
import Header from './Header.js';
import Createpage from './createstudent/createpage.js';
import { useNavigate } from 'react-router-dom';

const Listpage = ({students}) => {
  // Sample list of students
  function createstudent(){
    navigate("/addstudent")
}
const navigate = useNavigate();
  return (
    <div>
        <Header/>
        <div className="table-container">
      <h2>Student List</h2>
      <table className="student-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Grade</th>
            <th>number</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {students.map(student => (
            <tr key={student.id}>
              <td>{student.id}</td>
              <td>{student.name}</td>
              <td>{student.age}</td>
              <td>{student.class}</td>
              <td>{student.number}</td>
              <td>< button className = "edit-btn">Edit</button> <button className = "delete-button">Delete</button></td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
    <button className='add-btn' onClick={createstudent}>
            Add Student
        </button>
    </div>

  );
};

export default Listpage;
