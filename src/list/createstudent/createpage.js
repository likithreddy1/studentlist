import React from 'react';
import './createpage.css';
import { useNavigate } from 'react-router-dom';
function Createpage(){
    function createstudent(){
        navigate("/addstudent")
    }
    const navigate = useNavigate();
  return (
    <div>
    </div>
  );
};

export default Createpage;
