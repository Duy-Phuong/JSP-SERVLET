package DAO;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class HomeDAO {
		public static void upload(HttpServletRequest request, HttpServletResponse response) {
			// Check that we have a file upload request
			final String address = "E:\\SUBJECT\\JAVA";
			final int  yourMaxMemorySize = 1024 * 1024*3; //3M
			final int  yourMaxRequestSize = 1024 * 1024*50; //50M
			//kt minh da bo doan enctype... do chua
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if(!isMultipart) {
				request.setAttribute("msg", "not have enctype");
			}
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// Set factory constraints
			factory.setSizeThreshold(yourMaxMemorySize);
			factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			// Set overall request size constraint
			upload.setSizeMax(yourMaxRequestSize);
			

			// Parse the request
			try {
				List<FileItem> items = upload.parseRequest(request);
				// Process the uploaded items
				Iterator<FileItem> iter = items.iterator();
				while (iter.hasNext()) {
				    FileItem item = iter.next();

				    if (!item.isFormField()) {
				    	 String fileName = item.getName();
				    	 ///vt muon upload file vao
				    	 String pathFile = address + File.separator + fileName;
				    	 File uploadedFile = new File(pathFile);
				    	 try {
				    		// tests if file exists
				             boolean kt = uploadedFile.exists();
				    		 if(kt == true)
				    		 {
				    			 request.setAttribute("msg","file exists");
				    		 }else {
				    			 item.write(uploadedFile);
				    			 request.setAttribute("msg","upload file successfully");
				    		 }
							
							//request.setAttribute("path",pathFile);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    } else {
				    	request.setAttribute("msg","upload file failed");
				    }
				}
			} catch (FileUploadException e) {
				request.setAttribute("msg", e.getMessage());
			}
			RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
			try {
				rd.forward(request, response);
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
